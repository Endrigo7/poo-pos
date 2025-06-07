package com.oo;

import com.oo.dao.cliente.ClienteDao;
import com.oo.dao.cliente.ClienteDaoArray;
import com.oo.dao.cliente.ClienteDaoList;
import com.oo.models.cliente.Cliente;
import com.oo.models.conta.Conta;
import com.oo.models.conta.ContaCDB;
import com.oo.models.conta.ContaCorrente;
import com.oo.models.conta.ContaPoupanca;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class Teste {

    public static void main(String[] args) {
        String cpfSeuJoao = "123.456.789-11";
        String cpfSeuJose = "254.578.215-11";

        Cliente c1 = new Cliente(
                cpfSeuJoao,
                "Seu João",
                Arrays.asList(new ContaCorrente(), new ContaPoupanca())
        );

        c1.getContas().get(0).creditar(new BigDecimal(100));
        c1.getContas().get(1).creditar(new BigDecimal(50));


        if (c1.getContas().get(1) instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca =  (ContaPoupanca) c1.getContas().get(1);
            contaPoupanca.setDiaAniversario(7);
            contaPoupanca.renderJuros(new BigDecimal(0.01));
            System.out.println("Saldo após  render juros : " +  contaPoupanca.getSaldo());
        }

        Cliente c2 = new Cliente(
                cpfSeuJose,
                "Seu José",
                Collections.singletonList(new ContaCDB())
        );

        System.out.println("Meu primeiro é cliente se chama "
        + c1.getNome() + " e tem saldo conta "
                + c1.getContas().get(0).exibirSaldoAtual()  +
                " saldo da poupanca "
                + c1.getContas().get(1).exibirSaldoAtual()
                + " hashcode " + c1.hashCode());

        System.out.println("Meu segundo é cliente se chama "
                + c2.getNome() + " e tem saldo " + c2.getContas().get(0).exibirSaldoAtual());

        ClienteDao clienteDao = ClienteDaoList.getInstance();

        clienteDao.salvarCliente(c1);
        buscaEImprimeCliente(c1.getCpf(), clienteDao);

        clienteDao.salvarCliente(c2);
        buscaEImprimeCliente(c2.getCpf(), clienteDao);
    }

    private static void buscaEImprimeCliente(String cpf, ClienteDao clienteDao) {
        System.out.println("Buscando cliente pelo cpf....");
        System.out.println("buscando cliente com cpf " + cpf);

        espera2s();

        Cliente clienteEncontrado  = clienteDao.buscarContaPorCPF(cpf);
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado);
        } else {
            System.out.println("Nao foi possivel encontrar o cliente de Cpf " + cpf);
        }
    }

    private static void espera2s() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}

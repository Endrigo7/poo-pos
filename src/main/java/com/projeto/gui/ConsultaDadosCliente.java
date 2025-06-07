package com.projeto.gui;

import com.projeto.dao.cliente.ClienteDao;
import com.projeto.dao.cliente.ClienteDaoPostgres;
import com.projeto.models.cliente.Cliente;

import java.util.Scanner;

public class ConsultaDadosCliente {

    public void ConsultaDadosCliente(Scanner leTeclado) {
        System.out.println("Informe o CPF do cliente");
        String cpf = leTeclado.next();

        ClienteDao clienteDao = ClienteDaoPostgres.getInstance();
        Cliente cliente = clienteDao.buscarContaPorCPF(cpf);

        if(cliente != null) {
            System.out.println("-----------------------------");
            System.out.println("Dados encontrados do cliente ");
            System.out.println("-----------------------------");

            System.out.println("Nome completo......: " + cliente.getNome());
            System.out.println("cpf................: " + cliente.getCpf());

            System.out.println("-----------------------------");
        } else {
            System.out.println("Cliente com CPF " + cpf + " não encontrado!");
        }
    }
}

package com.projeto.gui;

import com.projeto.dao.cliente.ClienteDao;
import com.projeto.models.cliente.Cliente;

import java.util.Scanner;

public class InterfaceInicial {

    public void start(){
        Scanner leTeclado = new Scanner(System.in);

        Integer opcaoMenu = null;

        do {
            System.out.println("Bem vindo ao pos-graducao poo");
            System.out.println("Selecione uma opcao!");
            System.out.println("[1] - Abrir Conta");
            System.out.println("[2] - Consultar Saldo");
            System.out.println("[3] - Creditar");
            System.out.println("[4] - Debitar");
            System.out.println("[5] - Tranferir");
            System.out.println("[6] - Recuperar Senha");
            System.out.println("[7] - Consultar dados do cliente");
            System.out.println("[0] - Sair");

            opcaoMenu = leTeclado.nextInt();
            switch (opcaoMenu) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    ConsultaDadosCliente consultaDadosCliente = new ConsultaDadosCliente();
                    consultaDadosCliente.ConsultaDadosCliente(leTeclado);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida!!!");
            }

        } while (opcaoMenu != 0);


    }

    private void buscaEImprimeCliente(String cpf, ClienteDao clienteDao) {
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

    private void espera2s() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

}

package com.projeto.models.cliente;

import com.projeto.models.conta.Conta;

import java.util.List;

public class ClientePF extends Cliente{

    public ClientePF(String cpf, String nome, List<Conta> contas) {
        super(cpf, nome, contas);
    }
}

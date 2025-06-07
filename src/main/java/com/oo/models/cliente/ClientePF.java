package com.oo.models.cliente;

import com.oo.models.conta.Conta;

import java.util.List;

public class ClientePF extends Cliente{

    public ClientePF(String cpf, String nome, List<Conta> contas) {
        super(cpf, nome, contas);
    }
}

package com.oo.models.cliente;

import com.oo.models.conta.Conta;

import java.util.List;

public class ClientePJ extends Cliente{
    public ClientePJ(String cpf, String nome, List<Conta> contas) {
        super(cpf, nome, contas);
    }
}

package com.projeto.dao.conta;

import com.projeto.models.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaDaoList implements ContaDao{

    private static final ContaDaoList INSTANCIA = new ContaDaoList();
    private static final List<Conta> contas = new ArrayList<>();

    private ContaDaoList(){
    }

    public ContaDaoList getInstancia() {
        return INSTANCIA;
    }


    @Override
    public void salvarConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public Conta buscarContaPorNumero(String numero) {
        return contas
                .stream()
                .filter(conta -> conta.getNumero().equals(numero))
                .findFirst()
                .orElse(null);
    }
}

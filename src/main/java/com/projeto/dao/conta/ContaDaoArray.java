package com.projeto.dao.conta;

import com.projeto.models.conta.Conta;

public class ContaDaoArray implements ContaDao {
    private static final ContaDaoArray INSTANCIA = new ContaDaoArray();
    private static final int NUMERO_MAXIMO_DE_CONTAS = 3;
    private static final Conta[] contas = new Conta[NUMERO_MAXIMO_DE_CONTAS];
    private static int indice = 0;

    private ContaDaoArray(){
    }

    public static ContaDaoArray getInstance() {
        return INSTANCIA;
    }

    @Override
    public void salvarConta(Conta conta) {
        if(indice > NUMERO_MAXIMO_DE_CONTAS) {
            System.out.println("Não é possível criar mais contas. Numero máximo antigido!!");
        }

        contas[indice] = conta;
        indice++;

    }

    @Override
    public Conta buscarContaPorNumero(String numero) {
        for (int i = 0 ; i < NUMERO_MAXIMO_DE_CONTAS; i++) {
            if (numero.equals(contas[i].getNumero())) {
                return contas[i];
            }
        }

        return null;
    }
}

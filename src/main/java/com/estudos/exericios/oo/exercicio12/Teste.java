package com.estudos.exericios.oo.exercicio12;

import java.math.BigDecimal;

public class Teste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Seu Joao");
        Pessoa p3 = new Pessoa("Seu Jose", "Rua sem numero", "1234-1234");

        Fornecedor fornecedor = new Fornecedor(p3, new BigDecimal(100), new BigDecimal(80));
        System.out.println(fornecedor);

    }

}

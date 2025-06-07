package com.estudos.exericios.oo.exercicio8;

import java.math.BigDecimal;

public class Teste {

    public static void main(String[] args) {
        final BigDecimal VALOR_INGRESSO = BigDecimal.TEN;

        Ingresso ingresso = new Ingresso(VALOR_INGRESSO);
        IngressoVip vip = new IngressoVip(VALOR_INGRESSO, new BigDecimal(20));

        System.out.println(ingresso);
        System.out.println(vip);
    }

}

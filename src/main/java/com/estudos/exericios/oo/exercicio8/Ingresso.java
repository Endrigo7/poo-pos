package com.estudos.exericios.oo.exercicio8;

import java.math.BigDecimal;

public class Ingresso {

    private BigDecimal valor;

    public Ingresso(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "O valor do ingresso é: ".concat(valor.toString());
    }
}

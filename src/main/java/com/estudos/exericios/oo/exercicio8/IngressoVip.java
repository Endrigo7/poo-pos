package com.estudos.exericios.oo.exercicio8;

import java.math.BigDecimal;

public class IngressoVip extends Ingresso{

    public BigDecimal valorAdiional;

    public IngressoVip(BigDecimal valor, BigDecimal valorAdiional) {
        super(valor);
        this.valorAdiional = valorAdiional;
    }

    @Override
    public String toString(){
        return "O valor do ingresso VIP é: ".concat(
                getValor().add(valorAdiional).toString()
        );
    }
}

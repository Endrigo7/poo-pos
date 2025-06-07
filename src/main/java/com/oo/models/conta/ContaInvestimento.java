package com.oo.models.conta;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(){
        super();
    }

    @Override
    public BigDecimal creditar(BigDecimal valor){
        BigDecimal bonus = valor
                .multiply(new BigDecimal(0.0001))
                .setScale(2, HALF_EVEN);

        setSaldo(getSaldo()
                .add(valor)
                .add(bonus));

        return getSaldo();
    }

}

package com.oo.models.conta;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;

public class ContaCDB extends ContaComRendimentos {

    private static int numeroConta = 1;

    public ContaCDB() {
        setNumero(String.valueOf(numeroConta)); ;
        setSaldo(BigDecimal.ZERO);
        numeroConta++;
    }

    @Override
    public BigDecimal renderJuros(BigDecimal taxa) {
        BigDecimal rendimento = getSaldo()
                .multiply(new BigDecimal(0.005))
                .setScale(2, HALF_EVEN);

        setSaldo(getSaldo()
                .add(rendimento)
                .setScale(2, HALF_EVEN));

        return getSaldo();
    }
}

package com.oo.models.conta;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{

    private BigDecimal limiteChequeEspecial;

    public ContaCorrente() {
        super();
    }

    @Override
    public BigDecimal debitar(BigDecimal valor) {
        BigDecimal saldoComLimite = getSaldo().add(limiteChequeEspecial);

        if (valor.compareTo(saldoComLimite) < 0) {
            System.out.println("Voce não tem saldo suficente para realizar essa operação. Saldo + Limite: "  + saldoComLimite);
            return saldoComLimite;
        }

        setSaldo(getSaldo().subtract(valor));

        return getSaldo();
    }
}

package com.projeto.models.conta;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
@ToString
public abstract class Conta {
    public String numero;
    private BigDecimal saldo;

    private static int numeroConta = 1;

    public Conta(){
        numero = String.valueOf(numeroConta);
        saldo = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
        numeroConta++;
    }

    public BigDecimal exibirSaldoAtual() {
        return saldo;
    }

    public BigDecimal creditar(BigDecimal valor) {
        saldo = saldo.add(valor);
        return saldo;
    }

    public BigDecimal debitar(BigDecimal valor) {
        if (valor.compareTo(saldo) == -1) {
            System.out.println("Voce não tem saldo suficente para realizar essa operação. Saldo: "  + saldo);
            return saldo;
        }

        saldo = saldo.subtract(valor);
        return saldo;
    }
}


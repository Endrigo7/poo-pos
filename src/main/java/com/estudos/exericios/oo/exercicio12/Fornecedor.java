package com.estudos.exericios.oo.exercicio12;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Fornecedor extends Pessoa {

    private BigDecimal valorCredito;
    private BigDecimal valorDivida;

    public Fornecedor(Pessoa pessoa, BigDecimal valorCredito, BigDecimal valorDivida) {
        super(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone());
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }


    public BigDecimal obterSaldo() {
        return valorCredito.subtract(valorDivida);
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "nome='" + getNome() + '\'' +
                ", endereco=" + getEndereco() +
                ", telefone='" + getTelefone() + '\'' +
                ", valorCredito='" + valorCredito + '\'' +
                ", valorDivida='" + valorDivida + '\'' +
                ", saldo='" + obterSaldo() + '\'' +
                "} ";
    }
}

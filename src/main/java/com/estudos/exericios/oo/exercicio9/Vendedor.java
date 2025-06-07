package com.estudos.exericios.oo.exercicio9;

public class Vendedor extends Empregado {

    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super();
        setNome(nome);
        super.salario = salario;
        this.percentualComissao = percentualComissao;

    }

    private float calcularSalario() {
        return salario + ((salario * percentualComissao) / 100);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome=" + getNome() +
                ", salario=" + salario +
                ", salario com comisssao=" + calcularSalario() +
                ", percentualComissao=" + percentualComissao +
                "} ";
    }
}

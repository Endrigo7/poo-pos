package com.estudos.exericios.oo.exercicio9;

public class Gerente extends Empregado{

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                ",nome='" + getNome() + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                "} ";
    }
}

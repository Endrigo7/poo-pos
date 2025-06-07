package com.estudos.models;

//public or Default , significa não especificar o modificador Ex. Enum Color.
public class Car {
    private Color color;
    String placa;
    protected long chassi;
    public String modelo;
    final public double valor = 100000.00;

    public Car(){
        color = Color.WHITE;
    }

    public void imprimirPlaca() {
        System.out.println("A placa é: " + placa);
    }
}

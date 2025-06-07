package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q2 {


    /*
     * crie um programa JAVA que le dois números do teclado
     * e calcula a media ponderada entre eles.
     * considere Peso1 = 10, Peso2 = 12
     * Valor1 multiplicado com Peso1
     * somando
     * Valor2 multiplicado com Peso2
     * Dividido
     * Por soma dos Peso
     */
    public static void main(String[] args) {
        final int PESO_1 = 10;
        final int PESO_2 = 12;

        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite os dois valores para a media ponterada ser calculada");
        double valorA = leTeclado.nextDouble();
        double valorB = leTeclado.nextDouble();

        double dividendo = (valorA * PESO_1) + (valorB * PESO_2);
        double divisor = PESO_1 + PESO_2;
        double media = dividendo / divisor;

        System.out.println("O valor de media é " + media);
    }
}

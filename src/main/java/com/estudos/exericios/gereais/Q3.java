package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q3 {

    /*
     * crie um programa Java que le um numero
     * inteiro e informa se ele é par ou impar
     */
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numeroInteiro = leTeclado.nextInt();

        int restoDe2 = numeroInteiro % 2;

        if (restoDe2 == 0) {
            System.out.println("O numero " + numeroInteiro + " é par!");
        } else {
            System.out.println("O numero " + numeroInteiro + " é impar!");
        }
    }
}

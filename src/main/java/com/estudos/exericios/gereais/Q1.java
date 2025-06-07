package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q1 {

    /*
     * crie um progama JAVA que le dois números do teclado e
     * imprime a soma entre eles.
     */
    public static void main( String[] args ){
       Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros");
        int valorA = leTeclado.nextInt();
        int valorB = leTeclado.nextInt();

        System.out.println("O resultado da soma entre A e B é: " + (valorA + valorB));
    }
}

package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q4 {

    /*
     * crie um programa Java que le um numero
     * inteiro e imprima o numero QUANDO ele for:
     * PAR
     * E multipo de 3
     * E multipo de 5
     * E multipo de 7
     * E multipo de 11
     * Exemplo de saida
     * se for verdadeiro -> O numero é par e multipo de 3, 5, 7, 11
     * se for falso -> O numero não está enquadrado nos criterios de impressao
     */
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numeroInteiro = leTeclado.nextInt();

        boolean isPar = (numeroInteiro % 2) == 0;
        boolean isMultiplo3 = (numeroInteiro % 3) == 0;
        boolean isMultiplo5 = (numeroInteiro % 5) == 0;
        boolean isMultiplo7 = (numeroInteiro % 7) == 0;
        boolean isMultiplo11 = (numeroInteiro % 11) == 0;

        if (isPar && isMultiplo3 && isMultiplo5
                && isMultiplo7 && isMultiplo11) {
            System.out.println("O numero é " + numeroInteiro + " par e multipo de 3, 5, 7, 11");
        } else {
            System.out.println("O numero " + numeroInteiro + " não está enquadrado nos criterios de impressao");
        }
    }
}

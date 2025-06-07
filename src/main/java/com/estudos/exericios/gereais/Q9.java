package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q9 {

    /* Crie um progama JAVA que le um numero inteiro,
     * e escreve todos os numeros impar o multiplo de 3
     * de 1 até o numero lido
     * exemplo - numeroLido = 15; SAIDA = 3, 9, 15
     * POREM desta vez utilize FOR
     */
    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int numeroLido = leTeclado.nextInt();

        for(int contador = 1 ; contador <= numeroLido ; contador++) {
            boolean isImpar = contador % 2 != 0;
            boolean isMultiplo3 = contador % 3 == 0;

            if (isImpar && isMultiplo3) {
                System.out.print(contador + ", ");
            }
        }
    }

}

package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q5 {


    /*
     * crie um programa Java que calcula a media ponderada (Usar questao 2 como base)
     * e informa
     * se a media maior que 7 então "Aluno aprovodo com media X"
     * se a media maior que 3.9 e menor que 7 então "Aluno aluno na final
             " com media X precisando tirar nota Y"
      * se media for menor ou igual a 3.9 "Aluno reprovado com media X"
      * Para calcular quanto o aluno precisa tirar na final
      * 10 - media
      * Exemplo aluno com media 4,5 precisará tirar 6,5 na final.
     */
    public static void main(String[] args) {
        final int PESO_1 = 7;
        final int PESO_2 = 9;
        final int NOTA_MAXIMA_FINAL = 10;

        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Digite os duas notas do aluno");
        double nota1 = leTeclado.nextDouble();
        double nota2 = leTeclado.nextDouble();

        double dividendo = (nota1 * PESO_1) + (nota2 * PESO_2);
        double divisor = PESO_1 + PESO_2;
        double media = dividendo / divisor;

        if (media >= 7) {
            System.out.println("Aluno aprovodo com media " + media);
        } else if(media > 4) {
            double notaNessariaParaFinal = NOTA_MAXIMA_FINAL - media;
            System.out.println("Aluno na final com media " + media
                    + " precisando tirar nota " + notaNessariaParaFinal);
        } else {
            System.out.println("Aluno reprovado com media " + media);
        }
    }
}

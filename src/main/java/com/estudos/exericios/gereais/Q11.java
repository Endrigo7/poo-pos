package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        int t1lado1, t1lado2, t1lado3;
        double perimetroT1, areaT1;

        int t2lado1, t2lado2, t2lado3;
        double perimetroT2, areaT2;

        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite os lados do primeiro triangulo");
        t1lado1 = leTeclado.nextInt();
        t1lado2 = leTeclado.nextInt();
        t1lado3 = leTeclado.nextInt();

        System.out.println("Digite os lados do segundo triangulo");
        t2lado1 = leTeclado.nextInt();
        t2lado2 = leTeclado.nextInt();
        t2lado3 = leTeclado.nextInt();

        perimetroT1 = (t1lado1 + t1lado2 + t1lado3) / 2.0;
        perimetroT2 = (t2lado1 + t2lado2 + t2lado3) / 2.0;

        areaT1 = Math.sqrt(
                perimetroT1 * (perimetroT1 - t1lado1)
                        * (perimetroT1 - t1lado2)
                        * (perimetroT1 - t1lado3));

        areaT2 = Math.sqrt(
                perimetroT2 * (perimetroT2 - t2lado1)
                        * (perimetroT2 - t2lado2)
                        * (perimetroT2 - t2lado3));

        if (areaT1 > areaT2) {
            System.out.println("T1 é maior com area "
                    + areaT1
                    + " e t2 com area " + areaT2);
        } else {
            System.out.println("T2 é maior com area "
                    + areaT2
                    + " e t1 com area " + areaT1);
        }
    }
}

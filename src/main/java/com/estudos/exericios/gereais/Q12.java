package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q12 {
    static class Triangulo {
        int lado1;
        int lado2;
        int lado3;

        public double calcularPerimetro() {
            return (lado1 + lado2 + lado3) / 2.0;
        }

        public double calcularArea() {
            double perimetro = calcularPerimetro();
            return Math.sqrt(
                    perimetro * (perimetro - lado1)
                            * (perimetro - lado2)
                            * (perimetro - lado3));
        }

        public void carregaLadosTriangulo(Scanner leTeclado) {
            System.out.println("Digite os lados do primeiro triangulo");
            lado1 = leTeclado.nextInt();
            lado2 = leTeclado.nextInt();
            lado3 = leTeclado.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        t1.carregaLadosTriangulo(leTeclado);
        t2.carregaLadosTriangulo(leTeclado);

        if (t1.calcularArea() > t2.calcularArea()) {
            System.out.println("T1 é maior com area "
                    + t1.calcularArea()
                    + " e t2 com area " + t2.calcularArea());
        } else {
            System.out.println("T2 é maior com area "
                    + t2.calcularArea()
                    + " e t1 com area " + t1.calcularArea());
        }
    }
}

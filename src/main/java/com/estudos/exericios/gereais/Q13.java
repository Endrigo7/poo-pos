package com.estudos.exericios.gereais;

import java.util.Scanner;

public class Q13 {
    static class Triangulo {
        int lado1;
        int lado2;
        int lado3;

        public Triangulo(){
            System.out.println("Estou criando um triangulo!!!");
        }

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

        public void imprimeValoresDosLados(){
            System.out.println("lado1: " + lado1
                    + ", lado2: " + lado2
                    + ", lado3: " + lado3);
        }
    }

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Triangulo t3 = new Triangulo();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        t1.carregaLadosTriangulo(leTeclado);
        t2.carregaLadosTriangulo(leTeclado);
        t3.carregaLadosTriangulo(leTeclado);
        t1.imprimeValoresDosLados();
        t2.imprimeValoresDosLados();
        t3.imprimeValoresDosLados();

        t3 = t2;
        t2 = t1;
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        t1.lado1 = 45;
        t2.lado1 = 55;
        t3.lado1 = 65;

        t1.imprimeValoresDosLados(); // 55  - 1 - 1
        t2.imprimeValoresDosLados(); // 55 - 1 - 1   -->> // 65 - 2 - 2
        t3.imprimeValoresDosLados(); // 65 - 2 - 2
    }
}

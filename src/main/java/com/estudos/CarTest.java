package com.estudos;

import com.estudos.models.Car;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.modelo = "Fusca 1978";

        System.out.println(car.modelo);
        System.out.println(car.valor);
    }

}

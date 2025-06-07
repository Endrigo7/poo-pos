package com.estudos.models;

public class CarBuild {

    public Car newCar(){
        Car car = new Car();
        car.chassi = 123123123L;
        car.placa = "ABC1234";
        car.modelo = "Fusca 1978";

        return car;
    }

}

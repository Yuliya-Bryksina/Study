package com.study.bookStudy;

class Vehicle {
    int  passengers;
    int fuelcap;
    int mpg;
}
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        //Присваивание значений полям в объекте minivan
        minivan.fuelcap = 16;
        minivan.passengers = 7;
        minivan.mpg = 21;

        //Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может провезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");
    }
}
package com.oracle.abstraction;

abstract class MotorBike{
    abstract void brake();
}
class SportsBike extends MotorBike{
    public void brake(){
        System.out.println("This is sports bike brake!");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        SportsBike sportsBike = new SportsBike();
        sportsBike.brake();
    }
}

package com.oracle.polymorphism;

class Sum{
    int add(int a){
        System.out.println("int add method!");
        return a+a;
    }
    int add(int a, int b){
        System.out.println("two int add method!");
        return a+b;
    }
    double add(double a){
        System.out.println("double add method");
        return a+a;
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println(obj.add(10));
        System.out.println(obj.add(15.0));
        System.out.println(obj.add(10, 15));
    }
}

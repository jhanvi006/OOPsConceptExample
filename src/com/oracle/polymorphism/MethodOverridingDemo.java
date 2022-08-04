package com.oracle.polymorphism;

class Language{
    public void displayInfo(){
        System.out.println("Basic Language!");
    }
}
class Java extends Language{
    public void displayInfo(){
        System.out.println("Java Programming Language!");
    }
}
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Java java = new Java();
        java.displayInfo();
        Language language = new Language();
        language.displayInfo();
    }
}

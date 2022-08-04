package com.oracle.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Jhanvi");
        employee.setEmail("jk@gmail.com");
        employee.setSalary(30000);
        System.out.println(employee.toString());
    }
}

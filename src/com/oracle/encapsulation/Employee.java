package com.oracle.encapsulation;

public class Employee {
    private String name, email;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+getName()+", Email: "+getEmail()+", Salary: "+getSalary();
    }
}

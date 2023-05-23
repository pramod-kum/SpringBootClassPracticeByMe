package com.example.demo;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public Student(){
        System.out.println("Student called from Soring framework-11");
    }

    public Student(String name) {
        System.out.println("Student called from Soring framework");
        this.name = name;
    }
}

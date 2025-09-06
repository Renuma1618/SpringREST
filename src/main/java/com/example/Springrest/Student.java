package com.example.Springrest;

public class Student {
    private String Name;
    private String Surname;

    public Student(String name, String surname) {
        this.Name = name;
        this.Surname = surname;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public String getSurname() {
        return Surname;
    }
    public void setSurname(String surname){
        this.Surname = surname;
    }
}
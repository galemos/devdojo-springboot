package br.com.devdojo.awsome.model;
/*
 * Created by Gabriel Lemos on 13/06/2018.
 */

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

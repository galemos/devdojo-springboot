package br.com.devdojo.awsome.model;
/**
 * @author Created by Gabriel Lemos on 13/06/2018.
 */

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Student {
    private int id;
    private String name;
    public static List<Student> studentList;

    static {
        studentRepository();
    }

    public Student(int id, String name) {
        this(name);
        this.id = id;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    private static void studentRepository(){
        studentList = new ArrayList<>(asList(new Student(1,"Deku"), new Student(2,"Todoroki")));
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

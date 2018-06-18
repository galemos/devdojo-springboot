package br.com.devdojo.awsome.model;

/**
 * @author Created by Gabriel Lemos on 13/06/2018.
 */

import javax.persistence.Entity;

@Entity
public class Student extends AbstractEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

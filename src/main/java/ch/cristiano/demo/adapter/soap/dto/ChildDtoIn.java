/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.soap.dto;

import ch.cristiano.demo1.domain.model.Child;

/**
 * ChildDtoIn child data transfer object for writing actions.
 */
public class ChildDtoIn {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Child toDomain() {
        Child child = new Child();
        child.setFirstName(firstName);
        child.setLastName(lastName);
        return child;
    }
}

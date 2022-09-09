/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.persistence.entity;

import ch.cristiano.demo1.domain.model.Parent;

/**
 * Parent entity.
 */
public class ParentEntity {

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

    public ParentEntity ofDomain(Parent parent) {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setFirstName(parent.getFirstName());
        parentEntity.setLastName(parent.getLastName());
        return parentEntity;
    }

    public Parent toDomain() {
        Parent parent = new Parent();
        parent.setFirstName(this.firstName);
        parent.setLastName(this.lastName);
        return parent;
    }
}

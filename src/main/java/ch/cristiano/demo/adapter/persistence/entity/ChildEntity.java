/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.persistence.entity;

import ch.cristiano.demo1.domain.model.Child;

/**
 * Child entity.
 */
public class ChildEntity {

    private String firstName;
    private String lastName;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public ChildEntity ofDomain(Child child){
        ChildEntity childEntity = new ChildEntity();
        childEntity.setFirstName(child.getFirstName());
        childEntity.setLastName(child.getLastName());
        childEntity.setAge(child.getAge());
        return childEntity;
    }
    
    public Child toDomain(){
        Child child = new Child();
        child.setFirstName(this.firstName);
        child.setLastName(this.lastName);
        child.setAge(this.age);
        return child;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.soap.dto;

import ch.cristiano.demo1.domain.model.Child;

/**
 * ChildDto child data transfer object.
 */
public class ChildDto {

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ChildDto ofDomain(Child child) {
        ChildDto childDto = new ChildDto();
        childDto.setFullName(child.getFirstName() + " " + child.getLastName());
        return childDto;
    }
}

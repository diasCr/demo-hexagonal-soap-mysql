/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.soap.dto;

import java.util.List;

/**
 * FamilyDto family data transfer object.
 */
public class FamilyDto {

    public MotherDto mother;
    public FatherDto father;
    public List<ChildDto> childDtos;
    private int personCounter;

    public MotherDto getMother() {
        return mother;
    }

    public void setMother(MotherDto mother) {
        this.mother = mother;
    }

    public FatherDto getFather() {
        return father;
    }

    public void setFather(FatherDto father) {
        this.father = father;
    }

    public List<ChildDto> getChildDtos() {
        return childDtos;
    }

    public void setChildDtos(List<ChildDto> childDtos) {
        this.childDtos = childDtos;
    }

    public int getPersonCounter() {
        return personCounter;
    }

    public void setPersonCounter(int personCounter) {
        this.personCounter = personCounter;
    }
}

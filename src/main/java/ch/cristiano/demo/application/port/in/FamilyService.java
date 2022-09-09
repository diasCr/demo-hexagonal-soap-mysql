/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.in;

import java.util.List;

import ch.cristiano.demo1.domain.model.Child;
import ch.cristiano.demo1.domain.model.Family;
import ch.cristiano.demo1.domain.model.Parent;

/**
 * FamilyService for the use case family.
 */
public interface FamilyService {

    public void createFamily(List<Parent> parents, List<Child> children);
    
    public List<Family> getAllFamilies();

}

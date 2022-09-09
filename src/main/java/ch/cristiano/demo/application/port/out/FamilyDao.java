/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.out;

import java.util.List;

import ch.cristiano.demo1.domain.model.Child;
import ch.cristiano.demo1.domain.model.Family;
import ch.cristiano.demo1.domain.model.Parent;

/**
 * FamilyDao interface for database communication.
 */
public interface FamilyDao {

    public void persistFamily(List<Parent> parents, List<Child> children);

    public List<Family> readAllFamilies();

}

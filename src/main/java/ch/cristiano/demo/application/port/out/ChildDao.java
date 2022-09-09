/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.out;

import java.util.List;

import ch.cristiano.demo1.domain.model.Child;

/**
 * ChildDao interface for database communication.
 */
public interface ChildDao {
    
    public void persistChild(Child child);
    
    public Child readByLastName(String lastName);
    
    public List<Child> readAll();

}

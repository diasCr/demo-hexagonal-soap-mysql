/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.in;

import java.util.List;

import ch.cristiano.demo1.domain.model.Child;

/**
 * ChildService for the use case child.
 */
public interface ChildService {

   public void createChild(Child child);

   public Child getByLastName(String lastName);
   
   public List<Child> getAllChildren();

}

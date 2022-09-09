/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.out;

import ch.cristiano.demo1.domain.model.Parent;

/**
 * ParentDao interface database communication.
 */
public interface ParentDao {
    
    public void persistParent(Parent parent);
    
}

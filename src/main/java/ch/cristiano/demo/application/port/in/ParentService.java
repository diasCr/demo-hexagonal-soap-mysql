/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.port.in;

import ch.cristiano.demo1.domain.model.Parent;

/**
 * ParentService for the use case parent.
 */
public interface ParentService {

   public void createParent(Parent parent);
}

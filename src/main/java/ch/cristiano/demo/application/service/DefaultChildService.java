/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ch.cristiano.demo1.domain.model.Child;
import ch.cristiano.demo1.domain.port.in.ChildService;
import ch.cristiano.demo1.domain.port.out.ChildDao;

/**
 * Service adapter for UseCase ChildService.
 */
@Stateless
public class DefaultChildService implements ChildService {
    
    @Inject
    private ChildDao childDao;

    @Override
    public void createChild(Child child) {
        childDao.persistChild(child);
    }

    @Override
    public Child getByLastName(String lastName) {
        return childDao.readByLastName(lastName);
    }

    @Override
    public List<Child> getAllChildren() {
        return childDao.readAll();
    }
    
}

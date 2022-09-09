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
import ch.cristiano.demo1.domain.model.Family;
import ch.cristiano.demo1.domain.model.Parent;
import ch.cristiano.demo1.domain.port.in.ChildService;
import ch.cristiano.demo1.domain.port.in.FamilyService;
import ch.cristiano.demo1.domain.port.in.ParentService;

/**
 * Service adapter for UseCase FamilyService.
 */
@Stateless
public class DefaultFamilyService implements FamilyService {

    @Inject
    private ChildService childService;

    @Inject
    private ParentService parentService;

    @Override
    public void createFamily(List<Parent> parents, List<Child> children) {
        children.forEach(child -> {
            childService.createChild(child);
        });
        parents.forEach(parent -> {
            parentService.createParent(parent);
        });

        //familyDao.persistFamily(parentIds, childIds);
    }

    @Override
    public List<Family> getAllFamilies() {
        //return familyDao.readAllFamilies();
        return null;
    }

}

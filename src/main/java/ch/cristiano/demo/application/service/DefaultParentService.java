/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.application.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ch.cristiano.demo1.domain.model.Parent;
import ch.cristiano.demo1.domain.port.in.ParentService;
import ch.cristiano.demo1.domain.port.out.ParentDao;

/**
 * Service adapter for UseCase ParentService.
 */
@Stateless
public class DefaultParentService implements ParentService {

    @Inject
    private ParentDao parentDao;

    @Override
    public void createParent(Parent parent) {
        parentDao.persistParent(parent);
    }

}

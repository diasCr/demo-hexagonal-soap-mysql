/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.persistence;

import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

import ch.cristiano.demo1.domain.model.Parent;
import ch.cristiano.demo1.domain.port.out.ParentDao;
import ch.cristiano.demo1.infrastructure.persistence.entity.ParentEntity;

/**
 * Persistence adapter for ParentDao.
 */
@ApplicationScoped
public class InMemoryParentDao implements ParentDao {
    
    private final Map<String, ParentEntity> parentStore = new HashMap<>();

    @Override
    public void persistParent(Parent parent) {
        parentStore.put(parent.getLastName(), new ParentEntity().ofDomain(parent));
    }
    
}

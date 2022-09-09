/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.cristiano.demo.adapter.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

import ch.cristiano.demo1.domain.model.Child;
import ch.cristiano.demo1.domain.port.out.ChildDao;
import ch.cristiano.demo1.infrastructure.persistence.entity.ChildEntity;

/**
 * Persistence adapter for ChildDao.
 */
@ApplicationScoped
public class InMemoryChildDao implements ChildDao {

    private final Map<String, ChildEntity> childStore = new HashMap<>();

    @Override
    public void persistChild(Child child) {
        childStore.put(child.getLastName(), new ChildEntity().ofDomain(child));
    }

    @Override
    public Child readByLastName(String lastName) {
        ChildEntity foundEntity = childStore.get(lastName);
        return foundEntity.toDomain();
    }

    @Override
    public List<Child> readAll() {
        List<Child> children = new ArrayList<>();
        childStore.entrySet().forEach(entry -> {
            children.add(entry.getValue().toDomain());
        });
        return children;
    }
}

package ir.hri.business;

import ir.hri.entity.StateEntity;
import ir.hri.util.JPAUtility;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class State {
    EntityManager entityManager =
            JPAUtility.getEntityManager();

    public List<StateEntity> getStates() {
        Query query = entityManager.createQuery("select t from StateEntity t");
        List<StateEntity> stateEntities = query.getResultList();
        return stateEntities;
    }

    public void close() {
        entityManager.close();
    }

    public void open() {
        if (entityManager == null || entityManager.isOpen() == false) {
            entityManager = JPAUtility.getEntityManager();
        }
    }
}

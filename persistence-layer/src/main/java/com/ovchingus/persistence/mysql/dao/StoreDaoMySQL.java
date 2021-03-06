package com.ovchingus.persistence.mysql.dao;

import com.ovchingus.persistence.mysql.entities.StoreEntityMySQL;

import java.util.List;

public class StoreDaoMySQL extends ConnectionMySQL<StoreEntityMySQL, Integer> {

    public StoreDaoMySQL() {
    }

    public boolean persist(StoreEntityMySQL entity) {
        getCurrentSession().save(entity);
        return getCurrentSession().contains(entity);
    }

    public boolean update(StoreEntityMySQL entity) {
        getCurrentSession().update(entity);
        return getCurrentSession().contains(entity);
    }

    public StoreEntityMySQL findById(Integer id) {
        return getCurrentSession().get(StoreEntityMySQL.class, id);
    }

    public StoreEntityMySQL findByName(String name) {
        return getCurrentSession().bySimpleNaturalId(StoreEntityMySQL.class).load(name);
    }

    public boolean delete(StoreEntityMySQL entity) {
        getCurrentSession().delete(entity);
        return !getCurrentSession().contains(entity);
    }

    @SuppressWarnings("unchecked")
    public List<StoreEntityMySQL> findAll() {
        return (List<StoreEntityMySQL>) getCurrentSession().createQuery("from StoreEntityMySQL").list();
    }

    public boolean deleteAll() {
        List<StoreEntityMySQL> entityList = findAll();
        for (StoreEntityMySQL entity : entityList) {
            if (!delete(entity)) return false;
        }
        return true;
    }
}

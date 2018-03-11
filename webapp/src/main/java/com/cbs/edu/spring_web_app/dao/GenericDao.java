package com.cbs.edu.spring_web_app.dao;

import java.util.List;

public interface GenericDao<ID, E> {

    E upsert(E entity);

    E get(ID id);

    void delete(ID id);

    List<E> getAll();
}

package com.cbs.java.database_interaction.dao;

import java.util.List;

public interface GenericDao<ID, E> {

    E upsert(E entity);

    E get(ID id);

    void delete(ID id);

    List<E> getAll();
}

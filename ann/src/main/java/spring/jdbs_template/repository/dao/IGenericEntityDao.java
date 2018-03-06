package spring.jdbs_template.repository.dao;

import java.util.List;

public interface IGenericEntityDao<ID,E>{
    E upsert(E entity);

    E get(ID id);

    void delete(ID id);

    List<E> getAll();
}

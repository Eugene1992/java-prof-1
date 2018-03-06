package crud.servlet.hibernate.dao;

import java.util.List;

public interface EntityDao<ID,E> {
    E create (E entity);
    E update (E entity);
    E get (ID id);
    void delete (ID id);
    List<E> getAll();

}

package DAO;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author gabriel_arsenio
 */
public interface DAO<T, I> {

    T save(T entity);//retorna a entidade 'save'

    boolean remove(Class<T> classe, I pk);

    List<T> getAll(Class<T> classe);

    T getById(Class<T> classe, I pk);

    EntityManager getEntityManager();
}

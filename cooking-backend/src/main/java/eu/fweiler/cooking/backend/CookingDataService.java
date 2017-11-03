package eu.fweiler.cooking.backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import eu.fweiler.cooking.backend.entity.CookingEntity;

/**
 * Simple example CrudService for storing beans. This should be removed and
 * replaced with a better backend service implementation.
 *
 * @param <T>
 *            bean type
 */
public class CookingDataService<T extends CookingEntity> implements Serializable {

    /**  */
	private static final long serialVersionUID = 5104818778620360524L;
	
	private Set<T> storage = new LinkedHashSet<T>();

    public void save(T entity) {
        if (storage.contains(entity)) {
            return;
        }
        storage.add(entity);
    }

    public List<T> findAll() {
        return new ArrayList<T>(storage);
    }

    public void delete(T entity) {
        storage.remove(entity);
    }
}

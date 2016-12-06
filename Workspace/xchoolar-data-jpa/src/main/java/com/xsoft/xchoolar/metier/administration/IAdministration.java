/**
 * 
 */
package com.xsoft.xchoolar.metier.administration;

import java.io.Serializable;
import static org.springframework.data.domain.ExampleMatcher.*;

/**
 * @author kapch1
 *
 */
public interface IAdministration {
	//public <T> T getUnique(Class<T> class1, );
	public <T> T save(T entity);
	public <T> T findOne(Class<T> class1,Serializable primaryKey);
	public <T> Iterable<T> findAll(Class<T> class1);
	public <T> Long count(Class<T> class1);
	public <T> void delete(T entity);
	//<S extends T> S findOne(Example<S> example);
	//<S extends T> Iterable<S> findAll(Example<S> example);
	
	public <T> T findOne(Class<T> class1,ExampleMatcher matcher);
	public <T> Iterable<T> findAll(Class<T> class1,ExampleMatcher matcher);
	public <T> Long count(Class<T> class1,ExampleMatcher matcher);
	public <T> void delete(Class<T> class1,ExampleMatcher matcher);
}

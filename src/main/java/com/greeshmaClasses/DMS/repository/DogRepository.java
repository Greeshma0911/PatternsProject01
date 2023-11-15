/**
 * 
 */
package com.greeshmaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.greeshmaClasses.DMS.Models.Dog;

/**
 * @author Greeshma Jale
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}

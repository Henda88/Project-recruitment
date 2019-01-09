package org.domain.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {

	void delete(Todo deleted);
	 
    List<Todo> findAll();
 
    Todo findOne(Long id);
 
    Todo save(Todo persisted);
}

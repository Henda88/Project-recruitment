package org.recruitement.domain.repositories;

import org.recruitement.domain.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
	
}

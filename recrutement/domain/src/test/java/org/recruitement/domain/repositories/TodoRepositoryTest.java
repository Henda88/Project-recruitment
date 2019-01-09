package org.recruitement.domain.repositories;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.recruitement.domain.config.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceContext.class})
public class TodoRepositoryTest {

	@Autowired
	public TodoRepository todoRepository;
	
	@Test
	public void getNom() {
		assertTrue(todoRepository.findAll().iterator().hasNext());
	}
}

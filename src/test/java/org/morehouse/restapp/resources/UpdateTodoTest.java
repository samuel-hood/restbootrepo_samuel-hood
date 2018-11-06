package org.morehouse.restapp.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UpdateTodoTest {
	// testChangeAssignee +
	@Test
	public void testChangeAssignee() {
		//setup
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee("someone else");
		//execute
		boolean isValid = resource.validateUpdate(existing, update);
		//validate
		assertTrue(isValid);
	}
	
	// testSetAssignee +
	@Test
	public void testSetAssignee() {
		//setup
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee(null);
		Todo update = new Todo();
		update.setAssignee("someone");
		//execute
		boolean isValid = resource.validateUpdate(existing, update);
		//validate
		assertTrue(isValid);
		
	}
	// testRemoveAssignee -
	@Test
	public void testRemoveAssignee() {
		//setup
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee(null);
		
		//execute
		boolean isValid = resource.validateUpdate(existing, update);
		
		//validate
		assertFalse(isValid);
		
	}
	// testLeaveAssigneeBlank +
	@Test
	public void  testLeaveAssigneeBlank() {
		//setup
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee(null);
		Todo update = new Todo();
		update.setAssignee(null);
		//execute
		boolean isValid = resource.validateUpdate(existing, update);
		//validate
		assertTrue(isValid);
		
	}

}
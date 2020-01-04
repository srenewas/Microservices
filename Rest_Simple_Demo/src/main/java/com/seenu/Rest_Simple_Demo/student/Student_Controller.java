package com.seenu.Rest_Simple_Demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
public class Student_Controller {
	
	@Autowired
	private Student_Service service;
	
	@GetMapping("/stud")
	public List<Student> RetrieveAll(){
		return service.FindAll();
		
	}
	@GetMapping("/stud/{id}")
	public Student RetriveOne(@PathVariable int id) {
		return service.FindOne(id);
	}
	
	@PostMapping("/stud")                      // By Default it gives the 200 (OK) Statuscode
	@ResponseStatus(HttpStatus.CREATED)       // This Annotation is used to Customizing the Status Codes it gives the 201 (Created) Status code
	public void insert(@RequestBody Student student) {
		Student s = service.save(student);
	}
	
	@DeleteMapping("/stud/{id}")
	public void delete(@PathVariable int id) {
		Student st = service.Delete(id);
	}

}

/**
 * 
 */
package com.cg.rohith.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rohith.bean.Student;

/**
 * @author rohikn
 *
 */
@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent(Integer id, String firstName, String lastName) {	
		Student student = new Student(
				id=1,
				firstName="Rohith",
				lastName="Kumar K N"
				
				);
		return student;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(Integer id, String firstName, String lastName){
		List<Student> students = new ArrayList<>();
		students.add(new Student(
				id=1, firstName="Rohith", lastName="Kumar K N"));
		students.add(new Student (
				id=2, firstName="Chandana", lastName="K N"));
		students.add(new Student (
				id=3, firstName="Vismitha", lastName="R"));
		return students;
	}
	
	//Spring Boot Rest API with Path Variable
	//{id}- URI template variable
	@GetMapping("/students/{id}/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable int id, 
			                           @PathVariable String firstName, 
			                           @PathVariable String lastName) {
		return new Student(id, firstName, lastName );
	}
	
	//Spring boot REST API with Request Param
	//http://localhost:8081/students/query?id=1&firstName=Rohith&lastName=Kumar K N
	@GetMapping("/students/query")
	public Student studentRequestVariable(@RequestParam Integer id,
			                              @RequestParam String firstName,
			                              @RequestParam String lastName) {
	return new Student(id, firstName, lastName);
	}
	
	//Spring boot RSET API that handles HTTP POST Request
	//@PostMapping and @RequestBody
	@PostMapping("/students/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		return student;
	}
	
	//Spring boot REST API that handles HTTP PUT Request- Updating existing resource
	@PutMapping("/students/{id}/update")
	public Student updateStudent(@RequestBody Student student, @PathVariable Integer id) {
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());		
		return student;
	}
	
	//Spring boot REST API that handles HTTP DELETE Request- deleting the existing resource
	@DeleteMapping("/students/{id}/delete")
		public String deleteStudent(@PathVariable Integer id) {
		System.out.println(id);
			return "Student data deleted sucessfully";
		}
	
	//ResponseEntity
	@GetMapping("/students/response")
	public ResponseEntity<Student> getResponseStudent(Integer id, String firstName, String lastName){
		Student student = new Student(
				id = 1,
				firstName = "Rohith",
				lastName = "Kumar K N"
				);
//		return new ResponseEntity<>(student, HttpStatus.OK);
		//or
//		return ResponseEntity.ok(student);
		//or
		return ResponseEntity.ok().header(firstName="custom-header", lastName="Rohith").body(student);
	}
	
	
	
	}
	


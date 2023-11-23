/**
 * 
 */
package com.cg.student;

/**
 * @author rohikn
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;	
    
    //Restful API methods for Retrieval operation
    @GetMapping("/management/all")
    public List<Student>listAll(){
    	return service.listAll();
    }
    
    //To retrieval by management through id
    @GetMapping("/management/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
        	Student student = service.get(id);
			return new ResponseEntity<Student> (student, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
		}
    }
    
    
     //To retrieval by candidate through id
    @GetMapping("/candidate/{id}")
    public ResponseEntity<Student> getbyid(@PathVariable Integer id) {
        try {
        	Student student = service.get(id);
			return new ResponseEntity<Student> (student, HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
		}
    }
    
    //To data the add the data to database
    @PostMapping("/management")
    public void add(@RequestBody Student student) {
    	service.save(student);   
    	}
    
    //To update data in database
    @PutMapping("/management/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Student student) {
        try {
        	Student existingResult = service.get(id);
			service.save(student);
			return new  ResponseEntity<> (HttpStatus.OK);
		} catch (Exception e) {
			return new  ResponseEntity<> (HttpStatus.NOT_FOUND);
		}
       
    }
    
    
    //To delete data in data base
    @DeleteMapping("/management/{id}")
    public void delete(@PathVariable Integer id) {
    		service.delete(id); 
    }
	
}


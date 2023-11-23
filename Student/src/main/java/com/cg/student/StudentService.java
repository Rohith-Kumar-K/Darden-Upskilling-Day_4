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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {

	@Autowired
	private StudentRepository repo;	
	
	//To List All
		public List<Student> listAll() {
			return repo.findAll();
		}
	
		//To save 
		public void save(Student student) {
			repo.save(student);
		}
		
		//To retrieve by management
		public Student get(Integer id) {
	       return repo.findById(id).get();		
	}
		
		       //To retrieve  by candidate
				public Student getbyid(Integer id) {
			       return repo.findById(id).get();		
			}
		
		//To delete
		public void delete(Integer id) {
			repo.deleteById(id);
		}
}


package com.cg.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	    @Id
	    private String name;
	    private int age;
	    private int salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", salary=" + salary + ", getName()=" + getName()
					+ ", getAge()=" + getAge() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	    
	    

	    
	}



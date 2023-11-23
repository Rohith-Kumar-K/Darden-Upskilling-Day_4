package com.cg.student;

import

static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class

StudentTest

{

	@Test

	void

			testGetName() {
		Student student = new Student();
		student.setName("Alice");
		assertEquals("Alice", student.getName());
	}

	@Test
	void testSetAge() {
		Student student = new Student();
		student.setAge(20);
		assertEquals(20, student.getAge());
	}

	@Test
	void testSetSalary() {
		Student student = new Student();
		student.setSalary(30000);
		assertEquals(30000, student.getSalary());
	}

	@Test
	void testToString() {
		Student student = new Student();
		student.setName("Bob");
		student.setAge(25);
		student.setSalary(40000);
		assertEquals(
				"Student [name=Bob, age=25, salary=40000, getName()=Bob, getAge()=25, getSalary()=40000, getClass()=class com.cg.student.Student, hashCode=32387549, toString()=Student [name=Bob, age=25, salary=40000, getName()=Bob, getAge()=25, getSalary()=40000, getClass()=class com.cg.student.Student, hashCode()=32387549, toString()=Student [name=Bob, age=25, salary=40000, getName()=Bob, getAge()=25, getSalary()=40000, getClass()=class com.cg.student.Student, hashCode()=32387549, toString()=...]]",
				student.toString());
	}
}
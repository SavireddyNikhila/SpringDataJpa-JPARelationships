package com.springdatajpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.entity.Student;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository;

	/*
	 * @Test public void saveStudent() { Student student =
	 * Student.builder().emailId("vandi@gmail.com").firstName("Sree").lastName(
	 * "Sree") //.guardianName("Ram").guardianEmail("ram@gmail.com").guardianMobile(
	 * "9573703204") .build();
	 * 
	 * studentRepository.save(student); }
	 * 
	 */

	/*
	 * @Test public void saveStudentWithGuardian() {
	 * 
	 * Guardian guardian =
	 * Guardian.builder().name("Sunitha").email("sunitha@gmail.com").mobile(
	 * "9837294310").build();
	 * 
	 * Student student =
	 * Student.builder().firstName("Vani").lastName("Rajula").emailId(
	 * "vani@gmail.com") .guardian(guardian).build();
	 * 
	 * studentRepository.save(student); }
	 */

	@Test
	public void printAllStudent() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println("studentList = " + studentList);
	}

	@Test
	public void PrintStudentByFirstName() {
		List<Student> students = studentRepository.findByFirstName("Sneha");
		System.out.println("students: " + students);
	}

	@Test
	public void PrintStudentByFirstNameContaining() {
		List<Student> students = studentRepository.findByFirstNameContaining("ni");
		System.out.println("students: " + students);
	}

	@Test
	public void printStudentByLastNameNotNull() {
		List<Student> students = studentRepository.findByLastNameNotNull();
		System.out.println("Students: " + students);
	}

	@Test
	public void printStudentByGuardianName() {
		List<Student> students = studentRepository.findByGuardianName("Sunitha");
		System.out.println("Students: " + students);
	}

	@Test
	public void printgetStudentByEmailAddress() {
		Student student = studentRepository.getStudentByEmailAddress("savi@gmail.com");
		System.out.println("student = " + student);
	}

	@Test
	public void printgetStudentFirstNameByEmailAddress() {
		String firstName = studentRepository.getStudentFirstNameByEmailAddress("savi@gmail.com");
		System.out.println("firstName = " + firstName);
	}

	@Test
	public void printgetStudentByEmailAddressNative() {
		Student student = studentRepository.getStudentByEmailAddressNative("vani@gmail.com");
		System.out.println("student = " + student);

	}

	@Test
	public void printgetStudentByEmailNativeNamedParam() {
		Student student1 = studentRepository.getStudentByEmailAddressNativeNamedParam("savi@gmail.com");
		System.out.println("student = " + student1);

	}
	
	@Test
	public void updateStudentFirstNameByEmailIdTest() {
		 studentRepository.updateStudentFirstNameByEmailId("NikhilaReddy","savi@gmail.com");
	}
}

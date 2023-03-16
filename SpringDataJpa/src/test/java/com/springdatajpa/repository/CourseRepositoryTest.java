package com.springdatajpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.entity.Course;
import com.springdatajpa.entity.Student;
import com.springdatajpa.entity.Teacher;

@SpringBootTest
class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;

	
	  @Test public void printCourses() { List<Course> course =
	  courseRepository.findAll(); System.out.println("Courses: " + course); }
	  
	  @Test public void saveCourseWithTeacher() { Teacher teacher =
	  Teacher.builder().firstName("Priyanka").lastName("Singh").build(); Course
	  course = Course.builder().title(".net").credit(7).teacher(teacher).build();
	  courseRepository.save(course); }
	 
	@Test
	public void saveCourseWithStudentAndTeacher() {
		Teacher teacher = Teacher.builder().firstName("Lizze").lastName("Morgan").build();
		Student student = Student.builder().firstName("Abhishek").lastName("Singh").emailId("abhi@gmail.com").build();
		Course course = Course.builder().title("AI").credit(4).teacher(teacher).build();

		course.addStudents(student);
		courseRepository.save(course);
	}

}

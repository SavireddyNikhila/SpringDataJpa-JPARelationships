package com.springdatajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.entity.Teacher;

@SpringBootTest
class TeacherRepositoryTest {

	@Autowired
	private TeacherRepository teacherRepository;

	@Test
	public void saveTeacher() {

		//Course courseJava = Course.builder().title("Java").credit(5).build();
		//Course courseDBA = Course.builder().title("DBA").credit(3).build();
		Teacher teacher = Teacher.builder()
				.firstName("Mira")
				.lastName("bhai")
				//.courses(List.of(courseJava, courseDBA))
				.build();

		teacherRepository.save(teacher);
	}

}

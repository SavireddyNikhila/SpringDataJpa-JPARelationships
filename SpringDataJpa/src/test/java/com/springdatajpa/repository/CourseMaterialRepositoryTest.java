package com.springdatajpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.entity.Course;
import com.springdatajpa.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialRepository repository;

	@Test
	public void saveCourseMaterial() {
		Course course = Course.builder()
				.title("Python")
				.credit(6)
				.build();
		CourseMaterial courseMaterial = CourseMaterial.builder()
				.url("www.twitter.com")
				.course(course)
				.build();

		repository.save(courseMaterial);
	}

	@Test
	public void getAllCourseMaterials() {
		List<CourseMaterial> materials = repository.findAll();
		System.out.println("CourseMaterials : " + materials);
	}

}

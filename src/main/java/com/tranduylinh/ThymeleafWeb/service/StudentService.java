package com.tranduylinh.ThymeleafWeb.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tranduylinh.ThymeleafWeb.entity.Student;

@Repository
public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}

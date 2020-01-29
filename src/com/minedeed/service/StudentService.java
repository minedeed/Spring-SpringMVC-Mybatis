package com.minedeed.service;

import com.minedeed.entiy.Student;

public interface StudentService {

	void add(Student student);

	void update(Student student);

	Student login(Student student);

	Student query(Integer id);
	

}

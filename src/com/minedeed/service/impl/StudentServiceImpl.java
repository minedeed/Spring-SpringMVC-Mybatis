package com.minedeed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minedeed.dao.StudentDao;
import com.minedeed.entiy.Student;
import com.minedeed.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public void delete(int parseInt) {
		// TODO Auto-generated method stub

	}

	public void add(Student student) {
		dao.addStudent(student);
	}

	public void update(StudentDao student) {
		// TODO Auto-generated method stub

	}

	public Student login(Student student) {
		// TODO Auto-generated method stub

		return student = dao.login(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		dao.update(student);
	}

	@Override
	public Student query(Integer id) {
		// TODO Auto-generated method stub
		return dao.queryStudent(id);
	}

}

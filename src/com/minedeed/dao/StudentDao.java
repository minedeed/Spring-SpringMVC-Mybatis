package com.minedeed.dao;

import com.minedeed.entiy.Student;

public interface StudentDao {
	// @Select("select * from student where username = #{username} and
	// password=#{password}")
	// @ResultMap("StudentResult")
	public Student login(Student student);

	public void update(Student student);

	// @Insert("insert into student
	// values(null,#{username},#{password},#{name},#{address},#{birthday},#{tel},#{email})")
	public void addStudent(Student student);

	public Student queryStudent(int id);

}

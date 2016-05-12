package com.zc.ibatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class StudentDAOImpl implements StudentDAO{
	private static SqlMapClient sqlMapClient;
	
	static{
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		try {
			sqlMapClient.insert("insertStudent", student);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudentBySequence(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		try {
			sqlMapClient.delete("deleteById", id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudentById(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> queryAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = null;
		try {
			students = sqlMapClient.queryForList("selectAll");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Student stu : students){
			System.out.println(stu.getSid() + "" + stu.getSname());
		}
		return null;
	}

	@Override
	public Student queryStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student queryStuentByName(String name) {
		// TODO Auto-generated method stub
		Student student;
		try {
			student = (Student) sqlMapClient.queryForObject("selectStudentByName",name);
			System.out.println(student.getBirth());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		studentDAOImpl.queryAllStudents();
		studentDAOImpl.deleteStudentById(2);
		System.out.println("----------------------------");
		studentDAOImpl.queryAllStudents();
	/*	studentDAOImpl.queryStuentByName("zc");
		Student student = new Student();
		student.setBirth(new Date(System.currentTimeMillis()));
		student.setSname("kkk");
		studentDAOImpl.addStudent(student);*/
	}

}

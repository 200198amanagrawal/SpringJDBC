package com.spring.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.JDBC.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		// rs.getInt(1) means that the 1st value is ID which is int and is the 1st column
		Student student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		return student;
	}

}

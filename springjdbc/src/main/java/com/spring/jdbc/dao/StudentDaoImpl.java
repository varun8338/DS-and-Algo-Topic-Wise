package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// insert operation
		String query = "insert into student(id,name,city) values(?,?,?)";
		int update = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}

	public int change(Student student) {
		// update operation
		String query = "update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return update;
	}

	public int delete(int studentId) {
		// delete operation
		String query = "delete from student where id=?";
		int delete = this.jdbcTemplate.update(query, studentId);
		return delete;
	}

	public Student getStudent(int studentId) {
		// selecting single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// selecting multiple student
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}

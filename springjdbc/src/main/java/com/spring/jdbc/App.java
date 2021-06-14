package com.spring.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Inside main method" );
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		/*
		 * ApplicationContext context = new
		 * AnnotationConfigApplicationContext(JdbcConfig.class);
		 */
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        //insert
        Student s=new Student();
        s.setId(90);
        s.setName("Michael");
        s.setCity("Scranton");
        int result = studentDao.insert(s);
        System.out.println("Student inserted "+result);
        
        //update
        /*Student s1=new Student();
        s1.setId(666);
        s1.setName("Joy");
        s1.setCity("Berlin");
        int result = studentDao.change(s);*/
		/*
		 * EmployeeDao employeeDao=context.getBean("employeeDao",EmployeeDao.class);
		 * Employee e=new Employee(101, "Varun Yadav", "CEO and Founder"); int
		 * result=employeeDao.insert(e);
		 */
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //System.out.println("Enter the id");
        //int id=Integer.parseInt(br.readLine());
        /*int result=studentDao.delete(id);
        System.out.println("Number of records deleted "+result);*/
        //Student s=studentDao.getStudent(id);
        //System.out.println(s);
        List<Student> students=studentDao.getAllStudents();
        for(Student student:students)
        	System.out.println(student);
    }
}

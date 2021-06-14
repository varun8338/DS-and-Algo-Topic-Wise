package com.employee.mangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.mangement.dao.EmployeeDAOImpl;
import com.employee.mangement.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException, ParseException
    {
        System.out.println("Inside Main Method");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        ApplicationContext ctx=
        		new ClassPathXmlApplicationContext("config.xml");
        EmployeeDAOImpl eDao=ctx.getBean("eDao",EmployeeDAOImpl.class);
        while(true) {
        	System.out.println("Choose the below options");
            System.out.println("1. Add Employee");        
            System.out.println("2. Delete Employee");        
            System.out.println("3. Update Employee");        
            System.out.println("4. View Employees");
            System.out.println("5. Exit");
            int choice=Integer.parseInt(br.readLine());
        	if(choice==1) {
        		System.out.println("What's your employee id?");
                int id=Integer.parseInt(br.readLine());
                System.out.println("Mobile Number(10-digit only)?");
                long mobile=Long.parseLong(br.readLine());
                System.out.println("What's your name?");
                String eName=br.readLine();
                System.out.println("What's your birth date(dd/MM/yyyy)?");
                String dob=br.readLine();
                System.out.println("What's your date of joining(dd/MM/yyyy)?");
                String doj=br.readLine();
                System.out.println("Name of the City where you reside?");
                String eCity=br.readLine();
                System.out.println("And it is in which state?");
                String eState=br.readLine();
                Employee e=new Employee(id, mobile, eName, sdf.parse(dob), sdf.parse(doj), eCity, eState);
                int insert = eDao.insert(e);
                System.out.println(insert);
        	}
        	else if(choice==2) {
        		System.out.println("Enter employee id to be deleted?");
        		int id=Integer.parseInt(br.readLine());
        		eDao.delete(id);
        	}
        	else if(choice==3) {
        		System.out.println("What's your employee id?");
                int id=Integer.parseInt(br.readLine());
                System.out.println("Mobile Number(10-digit only)?");
                long mobile=Long.parseLong(br.readLine());
                System.out.println("What's your name?");
                String eName=br.readLine();
                System.out.println("What's your birth date(dd/MM/yyyy)?");
                String dob=br.readLine();
                System.out.println("What's your date of joining(dd/MM/yyyy)?");
                String doj=br.readLine();
                System.out.println("Name of the City where you reside?");
                String eCity=br.readLine();
                System.out.println("And it is in which state?");
                String eState=br.readLine();
                Employee e=new Employee(id, mobile, eName, sdf.parse(dob), sdf.parse(doj), eCity, eState);
                eDao.update(e);
        	}
        	else if(choice==4) {
        		List<Employee> list=eDao.getEmployees();
        		for(Employee emp:list)
        			System.out.println(emp);
        	}
        	else {
        		break;
        	}
        }
        
        
    }
}

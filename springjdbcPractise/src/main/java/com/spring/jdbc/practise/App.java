package com.spring.jdbc.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.practise.dao.EmployeeDao;
import com.spring.jdbc.practise.entities.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);

		System.out.println("Inside main method");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a number to perform any operations ");
		System.out.println("1. Insert employee");
		System.out.println("2. Update employee");
		System.out.println("3. Search employee");
		System.out.println("4. View all employees");
		System.out.println("5. Delete employee");
		int choice = Integer.parseInt(br.readLine());
		while (choice != 0) {
			switch (choice) {
			case 1: {
				System.out.println("Enter employee id");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter employee's name");
				String name = br.readLine();
				System.out.println("Enter employee's designation");
				String designation = br.readLine();
				long milli = System.currentTimeMillis();
				Date doj = new Date(milli);
				Employee e = new Employee(id, name, designation, doj);
				int insert = employeeDao.insert(e);
				System.out.println("Employee Inserted " + insert);
				System.out.println("List of all employees");
				List<Employee> employees = employeeDao.getAllEmployees();
				for (Employee employee : employees) {
					System.out.println(employee);
				}
			}
				break;

			case 2: {
				System.out.println("Enter employee id");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter employee's name");
				String name = br.readLine();
				System.out.println("Enter employee's designation");
				String designation = br.readLine();
				long milli = System.currentTimeMillis();
				Date doj = new Date(milli);
				Employee e = new Employee(id, name, designation, doj);
				int update = employeeDao.change(e);
				System.out.println("Employee Inserted " + update);
				System.out.println("List of all employees");
				List<Employee> employees = employeeDao.getAllEmployees();
				for (Employee employee : employees) {
					System.out.println(employee);
				}
			}
				break;

			case 3: {
				System.out.println("Enter employee id");
				int id = Integer.parseInt(br.readLine());
				Employee e = employeeDao.getEmployee(id);
				System.out.println(e);
			}
				break;

			case 4: {
				System.out.println("List of all employees");
				List<Employee> employees = employeeDao.getAllEmployees();
				for (Employee employee : employees) {
					System.out.println(employee);
				}
			}

				break;

			case 5: {
				System.out.println("Enter employee id");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter password");
				String password = br.readLine();
				if (password.equals("root")) {
					int delete = employeeDao.delete(id);
					System.out.println("Employee ID " + id + " successfully deleted " + delete);
				} else
					System.out.println("Only admin can delete");
			}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println();
			System.out.println("Enter a number to perform any operations ");
			System.out.println("1. Insert employee");
			System.out.println("2. Update employee");
			System.out.println("3. Search employee");
			System.out.println("4. View all employees");
			System.out.println("5. Delete employee");
			System.out.println("Type 0 to exit");
			System.out.println();
			choice = Integer.parseInt(br.readLine());
		}

	}
}

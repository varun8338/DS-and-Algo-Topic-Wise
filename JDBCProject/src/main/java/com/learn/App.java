package com.learn;

import java.io.*;
import java.sql.Connection;

import com.learn.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			System.out.println("PRESS 1 to add student");
			System.out.println("PRESS 2 to delete student");
			System.out.println("PRESS 3 to update student");
			System.out.println("PRESS 4 to exit");
			int choice = Integer.parseInt(br.readLine());
			if(choice==1) {
				//add
				System.out.println("Adding");
				System.out.println("Enter id");
				String id=br.readLine();
				System.out.println("Enter name");
				String name=br.readLine();
				System.out.println("Enter address");
				String address=br.readLine();
				Student s=new Student(id,name,address);
				boolean status=StudentDAO.addStudent(s);
				System.out.println("Student added: "+status);
			}
			else if(choice==2) {
				//delete
				System.out.println("Deleting");
				System.out.println("Enter id to be deleted");
				String id=br.readLine();
				boolean status=StudentDAO.deleteStudent(id);
				System.out.println("Student deleted: "+status);
			}
			else if(choice==3) {
				System.out.println("Updating");
				System.out.println("Enter id to be updated");
				String id=br.readLine();
				System.out.println("Enter name");
				String name=br.readLine();
				System.out.println("Enter address");
				String address=br.readLine();
				boolean status=StudentDAO.updateStudent(id, name, address);
				System.out.println("Student Updated "+status);
			}
			else 
				break;
		}
	}
}

package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learn.DBConnection;
import com.learn.Student;

public class StudentDAO {
	public static boolean addStudent(Student s) {
		boolean status=false;
		Connection conn=DBConnection.getConnection();
		try {
			String query="insert into students values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1,s.getId());
			pst.setString(2,s.getName());
			pst.setString(3,s.getAddress());
			pst.executeUpdate();
			status=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Inside SQLException of addStudent");
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return status;
	}
	
	public static boolean deleteStudent(String id) {
		boolean status=false;
		Connection conn=DBConnection.getConnection();
		try {
			String query="delete from students where s_id=?";
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1, id);
			pst.executeUpdate();
			status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static boolean updateStudent(String id,String name,String address) {
		boolean status=false;
		Connection conn=DBConnection.getConnection();
		String query = "select * from students where s_id=?";
		try {
			PreparedStatement pst=conn.prepareStatement(query);
			pst.setString(1,id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println("ID: "+rs.getString("s_id"));
				System.out.println("Name: "+rs.getString("s_name"));
				System.out.println("Address: "+rs.getString("s_address"));
			}
			String updateQuery="update students set s_name=?,"
					+ "s_address=? where s_id='"+id+"'";
			PreparedStatement updatePst=conn.prepareStatement(updateQuery);
			updatePst.setString(1,name);
			updatePst.setString(2,address);
			updatePst.executeUpdate();
			status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}

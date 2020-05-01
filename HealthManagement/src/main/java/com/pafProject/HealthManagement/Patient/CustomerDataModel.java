package com.pafProject.HealthManagement.Patient;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CustomerDataModel {

	Connection con = null;
	
	Customer cus1 = new Customer();

	public CustomerDataModel() {
		String url = "jdbc:mysql://localhost:3306/paf-project?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println(" connected");
		} catch (Exception e) {
			System.out.println("not connected" + e);
		}
	}
	
//	public String createUser(String NIC, String FName, String LName, String Email, String PhoneNum, String BirthDay, String Address, String Password) {
//		String output = "";
//		
//		String sql = "INSERT INTO patient (`pat_id`,`pat_nic`,`FirstName`,`LastName`,`Email`,`PhoneNumber`,`Birthday`,`Address`,`Password`)"
//				+ " VALUES (?,?,?,?,?,?,?,?,?)";
//		
//		try {
//
//			PreparedStatement st = con.prepareStatement(sql);
//
//			st.setInt(1, 500);
//			st.setString(2, NIC);
//			st.setString(3, FName);
//			st.setString(4, LName);
//			st.setString(5, Email );
//			st.setInt(6, Integer.parseInt(PhoneNum));
//			st.setString(7, BirthDay);
//			st.setString(8, Address);
//			st.setString(9, Password);
//
//			st.execute();
//
//		} catch (Exception e) {
//
//			System.out.println("catch 3 " + e);
//
//		}
//		return null;
//
//	}

	public String getCustomers() {
		
		String output = "";
		
		String sql = "SELECT * FROM patient";

		try {
			
			output = "<table class=\"table table-striped table-dark\"> <thead> <tr> <th scope=\"col\">ID</th><th scope=\"col\"> Patient NIC</th><th scope=\"col\">First Name</th>"
					+ "<th scope=\"col\">Last Name</th><th scope=\"col\">Email</th> <th scope=\"col\">Phone Number</th> <th scope=\"col\">Birthday</th> "
					+ "<th scope=\"col\">Address</th> <th scope=\"col\">Password</th></tr> </thead>";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			System.out.println(rs);
			
			while (rs.next()) {
				
				String patID = Integer.toString(rs.getInt("pat_id"));
				String patNIC = rs.getString("pat_nic");
				String patFName = rs.getString("FirstName");
				String patLName = rs.getString("LastName");
				String patEmail = rs.getString("Email");
				String patPNum = rs.getString("PhoneNumber");
				String patBday = rs.getString("Birthday");
				String patAddr = rs.getString("Address");
				String patPass = rs.getString("Password");
				
				System.out.println(patID+"  "+patNIC+"  "+patFName+"  "+patLName+"  "+patEmail+"  "+patPNum+"  "+patBday+"  "+patAddr+"  "+patPass);
				
				output += "<tr>";
				output += "<td>"+patID+"</td>";
				output += "<td>"+patNIC+"</td>";
				output += "<td>"+patFName+"</td>";
				output += "<td>"+patLName+"</td>";
				output += "<td>"+patEmail+"</td>";
				output += "<td>"+patPNum+"</td>";
				output += "<td>"+patBday+"</td>";
				output += "<td>"+patAddr+"</td>";
				output += "<td>"+patPass+"</td>";
				output += "</tr>";

			}
			
			output += "</table>";
			
		} catch (Exception e) {
			System.out.println("catch 1 " + e);
		}
		
		return output;
	}

//	public Customer getCustomer(int id) {
//
//		String sqlq = "SELECT * FROM patient WHERE pat_id=" + id;
//		Customer cu1 = new Customer();
//		try {
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sqlq);
//
//			if (rs.next()) {
//
//				cu1.setCustomerId(rs.getInt(1));
//				cu1.setNIC(rs.getString(2));
//				cu1.setFirstname(rs.getString(3));
//				cu1.setLastname(rs.getString(4));
//				cu1.setEmail(rs.getString(5));
//				cu1.setPhoneNumber(rs.getInt(6));
//				cu1.setBirthday(rs.getString(7));
//				cu1.setAddress(rs.getString(8));
//				cu1.setPassword(rs.getString(9));
//
//			}
//		} catch (Exception e) {
//			System.out.println("catch 2 " + e);
//		}
//
//		return cu1;
//	}



//	public void updateUser(Customer cus1) {
//		String sql = "UPDATE patient set pat_nic=? , FirstName=?, LastName=?, Email=?, PhoneNumber=?, Birthday=?,Address=?, Password=? WHERE pat_id=?";
//		try {
//
//			PreparedStatement st = con.prepareStatement(sql);
//
//			st.setString(1, cus1.getNIC());
//			st.setString(2, cus1.getFirstname());
//			st.setString(3, cus1.getLastname());
//			st.setString(4, cus1.getEmail());
//			st.setInt(5, cus1.getPhoneNumber());
//			st.setString(6, cus1.getBirthday());
//			st.setString(7, cus1.getAddress());
//			st.setString(8, cus1.getPassword());
//			st.setInt(9, cus1.getCustomerId());
//
//			st.executeUpdate();
//
//		} catch (Exception e) {
//
//			System.out.println("catch 3 " + e);
//
//		}
//		
//	
//
//	}
//
//	public void delete(int id) {
//		String sql = "DELETE FROM patient WHERE pat_id=?";
//		try {
//
//			PreparedStatement st = con.prepareStatement(sql);
//
//			st.setInt(1, id);
//			st.executeUpdate();
//
//		} catch (Exception e) {
//
//			System.out.println("catch 4 " + e);
//
//		}
//
//	}


}

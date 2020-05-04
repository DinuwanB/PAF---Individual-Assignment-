package com.pafProject.HealthManagement.Patient;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("PatientApi")
public class PatientApi extends HttpServlet {
	
	CustomerDataModel item = new CustomerDataModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String output = item.createUser(request.getParameter("nic"), 
				request.getParameter("f_name"), request.getParameter("l_name"), request.getParameter("pat_mail"),
				request.getParameter("mob_num"), request.getParameter("p_bday"), request.getParameter("addr"), 
				request.getParameter("pass"));
		
		response.getWriter().write(output);
	}


	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

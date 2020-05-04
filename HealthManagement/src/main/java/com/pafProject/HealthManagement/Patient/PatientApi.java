package com.pafProject.HealthManagement.Patient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/PatientAPI")
public class PatientAPI extends HttpServlet {
	
	CustomerDataModel item = new CustomerDataModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String output = item.createUser(request.getParameter("nic"), 
				request.getParameter("f_name"), request.getParameter("l_name"), request.getParameter("pat_mail"),
				request.getParameter("mob_num"), request.getParameter("p_bday"), request.getParameter("addr"), 
				request.getParameter("pass"));
		
		response.getWriter().write(output);
	}
	
	private static Map getParsMap(HttpServletRequest request)
	{
		Map<String, String> map = new HashMap<String, String>();
		
		try {
			Scanner scan = new Scanner(request.getInputStream(), "UTF-8");
			String queryString = scan.hasNext() ? scan.useDelimiter("\\A").next() : "";
			scan.close();
			
			String[] params = queryString.split("&");
			for (String param : params) {
				
				String[] p = param.split("=");
				map.put(p[0],p[1]);
			}
			
		}
		catch(Exception e) {
			System.out.println("MAP Method    " + e);
		}
		
		return map;
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map paras = getParsMap(request);
		
		String output = item.updateUser(paras.get("hidPatSave").toString(), paras.get("nic").toString(),
				paras.get("f_name").toString(), paras.get("l_name").toString(), paras.get("pat_mail").toString(),
				paras.get("mob_num").toString(), paras.get("p_bday").toString(), paras.get("addr").toString(), 
				paras.get("pass").toString());
		
		response.getWriter().write(output);
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map paras = getParsMap(request);
		
		String output = item.delete(paras.get("patID").toString());
		
		response.getWriter().write(output);
		
		
	}

}

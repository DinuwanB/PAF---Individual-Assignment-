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


public class PatientAPI extends HttpServlet {
	
	CustomerDataModel item = new CustomerDataModel();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		
		String NIC      =   request.getParameter("nic");        
		String FNAME	=	request.getParameter("f_name");
		String LNAME	=	request.getParameter("l_name");
		String PATMAIL 	=	request.getParameter("pat_mail");
		String MOBNUM 	= 	request.getParameter("mob_num");
		String PBDAY	=	request.getParameter("p_bday");
		String ADDR 	= 	request.getParameter("addr");
		String PASS		=	request.getParameter("pass");
		
		String output = item.createUser(NIC, FNAME, LNAME, PATMAIL, MOBNUM, PBDAY, ADDR, PASS);
		
		System.out.println("API CALL  :  " +NIC);
		response.getWriter().write(output);
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		Map paras = getParsMap(request);
		
		String output = item.updateUser(paras.get("hidPatSave").toString(), paras.get("nic").toString(),
				paras.get("f_name").toString(), paras.get("l_name").toString(), paras.get("pat_mail").toString(),
				paras.get("mob_num").toString(), paras.get("p_bday").toString(), paras.get("addr").toString(), 
				paras.get("pass").toString());
		
		response.getWriter().write(output);
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		Map paras = getParsMap(request);
		
		String output = item.delete(paras.get("patID").toString());
		
		System.out.println(output + "Delete ID");
		
		response.getWriter().write(output);
		
		
	}

}

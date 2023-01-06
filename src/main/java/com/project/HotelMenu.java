package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HotelMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String foodString = request.getParameter("foods");
		String quntity = request.getParameter("quantity");
		String userName = request.getParameter("user_name");
		String userPhone = request.getParameter("user_phone");
		

		out.println("<h1> Bill Generated for</h1>");
		out.println("Name : "+ userName);
		out.println("Phone : "+ userPhone);
		out.println("Item : "+ foodString);
		out.println("Quntity : "+ quntity);
		
		
	}
	
	

}


package com.simplylearn.weapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplylearn.webapp.db.DatabaseConnection;

@WebServlet("/init-connection")
public class initcontroller extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		// setting content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DatabaseConnection connection = new DatabaseConnection();
		
		connection.jdbcOperation();
		
		out.print("<h3>Connection Estanlised.</h3>");
	}

}
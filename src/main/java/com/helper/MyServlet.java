package com.helper;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(name="Myname",urlPatterns={"/MyServlet"})
public class MyServlet extends HttpServlet 
{
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		Connection connection=ConnectionProvider.getConnection();
		System.out.println(connection);
		writer.println("<h1>Connection is created" +connection);
	}

}

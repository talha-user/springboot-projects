package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Myservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name1 = (String) req.getParameter("name1");
		String email1 = (String) req.getParameter("email1");
		String password1 = (String) req.getParameter("pass1");
		String gender1 = (String) req.getParameter("gender1");
		String city1 = (String) req.getParameter("city1");
		
		PrintWriter out =resp.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrappdb","root","root");
			PreparedStatement pst = con.prepareStatement("insert into register values(?,?,?,?,?)");
			pst.setString(1,name1);
			pst.setString(2,email1);
			pst.setString(3,password1);
			pst.setString(4,gender1);
			pst.setString(5,city1);
			
			int n = pst.executeUpdate();
			if(n>0) {
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>Registered successfully...</h3>");
				
				RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);	
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Error occured!!</h3>");
				
				RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}

		}
		catch(Exception e) {
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'> Exception occured !"+e.getMessage()+"</h3>");
			
			RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
			
		}
	}
}

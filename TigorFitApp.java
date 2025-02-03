package com.tigor.application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TigorFitApp")
public class TigorFitApp extends HttpServlet 
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("uname");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String branch = request.getParameter("branch");
		String email = request.getParameter("email");
		
		// for debugging purpose 
		System.out.println("Name : " + name);
		
		// JDBC
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/webapp_db";
			String user = "root";
			String pass = "9390135039";
			Connection connect = DriverManager.getConnection(url, user, pass);
			
			// duplicate userName checking
			String checkQuery = "SELECT * FROM userinfo WHERE username = ?";
			PreparedStatement userCheck = connect.prepareStatement(checkQuery);
			userCheck.setString(1, userName);
			ResultSet rs = userCheck.executeQuery();
			
			if(rs.next())
			{
				RequestDispatcher reqDispatch = request.getRequestDispatcher("/Failure.jsp");
				reqDispatch.forward(request, response);
			}
			
			else
			{
				String query = "INSERT INTO userinfo VALUES(?, ?, ?, ?, ?)";
				PreparedStatement prepstmnt = connect.prepareStatement(query);
				
				prepstmnt.setString(1, name);
				prepstmnt.setString(2, userName);
				prepstmnt.setString(3, password);
				prepstmnt.setString(4, branch);
				prepstmnt.setString(5, email);
				
				int rowAffected = prepstmnt.executeUpdate();
				
				
				
				if(rowAffected !=0)
				{
					RequestDispatcher reqDispatch = request.getRequestDispatcher("/Success.jsp");
					reqDispatch.forward(request, response);
				}
				connect.close();
				prepstmnt.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

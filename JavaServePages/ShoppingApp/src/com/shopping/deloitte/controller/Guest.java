package com.shopping.deloitte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Guest
 */
public class Guest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String wifename = request.getParameter("wifeName");
		
		response.setContentType("text/html");
 		PrintWriter out = response.getWriter();
 		
 		
 		
 		out.println("<h1>Welcome "+username);
 		out.println("<h1>You are in the Guest Session ! your wife Mrs."+wifename+"is ours now");
 		
 		
 		
 		
 		
	}

}

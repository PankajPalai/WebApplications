package com.pk.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterServlet extends HttpServlet {
	
	public void service(HttpServletRequest  req,HttpServletResponse res) throws ServletException,IOException{
		
		LocalDateTime sysDate=null;
		PrintWriter pw=null;
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		
		
		pw=res.getWriter();
		res.setContentType("text/html");
		sysDate=LocalDateTime.now();
		
		if(age<18) 
			pw.println("<h1>"+name+ " you are not eligible for Vote </h1> verified on "+sysDate);
		
		else
			pw.println("<h1>"+name+ " you are  eligible for vote</h1> verified on "+sysDate);
		
		pw.close();

			
		
		
	}
	
	

}

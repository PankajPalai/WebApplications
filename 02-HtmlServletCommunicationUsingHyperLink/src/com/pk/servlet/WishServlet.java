package com.pk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/wishurl") 
i dont want to use annotation based configuration in this application, 
i want a hands on experience on xml configuration
*/
public class WishServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	PrintWriter pw=null;
	pw=res.getWriter();
	String type="text/html";
	res.setContentType(type);
	LocalDateTime sysTime=null;
	sysTime=LocalDateTime.now();
	int hour=sysTime.getHour();
	if(hour<12)
		pw.println("<h1>Good Morning</h1>");
	else if(hour<15)
		pw.println("<h1>Good AfterNoon</h1>");
	else if(hour<20)
		pw.println("<h1>Good Evening</h1>");
	else 
		pw.println("<h1>Good Night</h1>");
	
	pw.println();
	
	pw.println("<a href='wish.html'>Home</a>");
		
		}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
		}

}

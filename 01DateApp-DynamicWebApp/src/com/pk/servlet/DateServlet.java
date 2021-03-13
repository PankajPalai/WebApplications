package com.pk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  This is a simple web application just to display date and time, i made it easier for understanding
 * @author Pankaj Palai
 * 
 * url of the application: http://localhost:5050/01DateApp-DynamicWebApp/durl
 * 
 * note: here durl is the url-pattern configured by me in web.xml configuration file
 *
 */

public class DateServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		Date d=null;
		d=new Date();
		//create printwriter
		PrintWriter pw= null;
		//get printWriter obj from response object
		pw=res.getWriter();
		//give instruction to browser to display given response as html document
		res.setContentType("text/html");
		pw.println("Date and Time :"+d);
		
		//it is optional , system.out.println() print message to serrvler console , during execution just look at the
		//server console then you will easily understood
		System.out.println(d);
	}
	

}

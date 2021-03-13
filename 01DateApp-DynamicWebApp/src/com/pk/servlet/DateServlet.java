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
 */

public class DateServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("DateServlet.service()");
		Date d=null;
		d=new Date();
		//create printwriter
		PrintWriter pw= null;
		//get printWriter obj from response object
		pw=res.getWriter();
		//give instruction to browser to display given response as html document
		res.setContentType("text/html");
		pw.println("Date and Time :"+d);
		System.out.println(d);
	}
	

}

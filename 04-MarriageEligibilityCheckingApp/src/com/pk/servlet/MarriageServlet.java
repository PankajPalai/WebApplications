package com.pk.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String name = req.getParameter("pname");
		int age = Integer.parseInt(req.getParameter("page"));
		String gender = req.getParameter("gender");

		pw = res.getWriter();
		res.setContentType("text/html");
		if(age>15 && age <150) {
		if (gender.equalsIgnoreCase("male")) {
			if (age < 21) {
				pw.println(name + " you are not eligible for marriage ");
				
			}

			else {
				pw.println("<h1>you are  eligible for marriage </h1>");
			}
		}

		else	if (gender.equalsIgnoreCase("female")) {
			if (age < 18) {
				pw.println(name + " you are not eligible for marriage ");
			}

			else {
				pw.println("<h1>you are  eligible for marriage </h1>");
			}
		}
		}
		else {
			pw.println("<h1>Please enter valide age  </h1>");
			
		}

		pw.close();

	}

}

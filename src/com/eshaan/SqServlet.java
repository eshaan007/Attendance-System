package com.eshaan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
//		HttpSession session = req.getSession();	
//		int k = (int)session.getAttribute("k");
		
		int k = 0;	
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
			
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		System.out.println("sq called");
	}
}

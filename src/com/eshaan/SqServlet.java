package com.eshaan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		int k = (int)req.getAttribute("k");
		
		k= k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
	}
}

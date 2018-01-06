package com.test.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calc
 */
@WebServlet(
		urlPatterns = { "/calc" }, 
		initParams = { 
				@WebInitParam(name = "number1", value = "nub1"), 
				@WebInitParam(name = "number2", value = "nub2")
		})
public class calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain;charset=UTF-8");
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String i = request.getParameter("nub1");
		String j = request.getParameter("nub2");
//		float s = Integer.parseInt(i) + Integer.parseInt(j);
		double s = Double.parseDouble(i)+Double.parseDouble(j);
		DecimalFormat df = new DecimalFormat("#.##"); 
		String f = df.format(s);
		System.out.println(df.format(s));
		Sqlconnect sql =  new Sqlconnect();
		String info = sql.Sqlconnect("select * from studentinfo");
		System.out.println(info);
		PrintWriter out = new PrintWriter(response.getOutputStream());
			out.println(f);
			out.print(info);
			out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.test.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Studen
 */
@WebServlet(
		urlPatterns = { "/Student" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "test", description = "description")
		})
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 List<jsonDemo> list=new ArrayList<jsonDemo>();
		 Gson gson = new Gson();
		 jsonDemo j = new jsonDemo();
		 j.setAge(10);
		 j.setName("jack");
		 j.setSex("boy");
		 j.setId("1");
		 list.add(j);
		 jsonDemo j1 = new jsonDemo();
		 j1.setAge(10);
		 j1.setName("tim");
		 j1.setSex("boy");
		 j1.setId("2");
		 list.add(j1);
		 Total nt = new Total(list.size(),list);
		 String str = gson.toJson(nt);
		 System.out.println(str);
		
		 PrintWriter out = new PrintWriter(response.getOutputStream());
			out.print(str);
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

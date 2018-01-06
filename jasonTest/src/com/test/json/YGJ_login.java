package com.test.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YGJ_login
 */
@WebServlet("/YGJ_login")
public class YGJ_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YGJ_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		String s = "{"+"\""+"Flag"+"\":"+"true,"+"\""+"errorInfo"+"\""+":"+"\"\""+""+","
					+"\""+"Content"+"\""+":"+"{"+"\"Mobile\":\"13281549858\",\"PostId"
				+"\" : \"3\", \"PostName\" : \"购油联系人\", \"Custid\" : \"川F000006\", \"CustName\" : "
				+ "\"绵竹市齐兴加油站\", \"KHSX\" : \"批发\", \"KHDZ\" : \"绵竹市齐天场镇口\", \"dgflag\" : \"0\", "
						+ "\"fstopflag\" : \"0\", \"SFTGSH\" :\"1\", \"QYSH\" : \"510683775822413\", \"KHDJ\" : \"小微客户\", \"depid\" : \"0013\", \"depName\" : \"德阳\", \"Managerid\" :"
								+ " \"00472373\", \"ManagerName\" : \"俞磊\", \"UBNum\" : 2178, \"CouponNum\" : 14, \"ManagerTel\" : \"13981036087\", \"SurplusOil\" : 156.5, \"ManagerImg\" : \"BackstageManagement/images/bbb.jpg\" } }"	;
//		{ "Flag" : true, "errorInfo" : "", "Content" : 
//		{ "Mobile" : "13281549858", "PostId" : "3", "PostName" : "购油联系人", "Custid" : "川F000006", "CustName" : "绵竹市齐兴加油站", "KHSX" : "批发", "KHDZ" : "绵竹市齐天场镇口", "dgflag" : "0", "fstopflag" : "0", "SFTGSH" : "1", "QYSH" : "510683775822413", "KHDJ" : "小微客户", "depid" : "0013", "depName" : "德阳", "Managerid" : "00472373", "ManagerName" : "俞磊", "UBNum" : 2178, "CouponNum" : 14, "ManagerTel" : "13981036087", "SurplusOil" : 156.5, "ManagerImg" : "BackstageManagement/images/bbb.jpg" } }
		PrintWriter out = new PrintWriter(response.getWriter());
		out.print(s);
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

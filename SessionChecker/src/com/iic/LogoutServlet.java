package com.iic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		PrintWriter out = res.getWriter();
		if(session.getAttribute("adminFlag") !=null && session.getAttribute("adminFlag").toString().equalsIgnoreCase("true")){

			out.write("UserName is ::"+session.getAttribute("userName") +"\n");
			out.write("userId is ::"+session.getAttribute("userId")+"\n");
			out.write("user is ::"+session.getAttribute("user")+"\n");
			out.write("adminFlag is  ::"+session.getAttribute("adminFlag")+"\n");
			
			out.write("After logout \n");
			
			session.setAttribute("userName", session.getAttribute("admin_session_username") );
			session.setAttribute("userId",  session.getAttribute("admin_session_userId"));
			session.setAttribute("user", session.getAttribute("admin_session_user"));
			session.removeAttribute("adminFlag");
			
			
			out.write("UserName is ::"+session.getAttribute("userName") +"\n");
			out.write("userId is ::"+session.getAttribute("userId")+"\n");
			out.write("user is ::"+session.getAttribute("user")+"\n");
			
			req.getRequestDispatcher("adminHome.jsp").forward(req, res);
			
		}else{
			out.write("UserName is "+session.getAttribute("userName")+"\n");
			session.invalidate();
			req.getRequestDispatcher("login.jsp").forward(req, res);
		}
		
	}

}

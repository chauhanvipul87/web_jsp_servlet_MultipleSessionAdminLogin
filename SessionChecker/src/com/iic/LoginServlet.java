package com.iic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String userName = req.getParameter("userName");
		String passWord = req.getParameter("passWord");
		String adminFlag = req.getParameter("adminFlag")==null ? "" : req.getParameter("adminFlag") ;
		
		if(userName.equalsIgnoreCase("vipul") && passWord.equalsIgnoreCase("vipul")){
			
			if(adminFlag.equalsIgnoreCase("")){
				HttpSession session = req.getSession(true);
				session.setAttribute("userName", userName);
				session.setAttribute("userId", 2);
				session.setAttribute("user", "normal");
				
			}else{
				
				HttpSession session = req.getSession();
				session.setAttribute("admin_session_username", session.getAttribute("userName"));
				session.setAttribute("admin_session_userId", session.getAttribute("userId"));
				session.setAttribute("admin_session_user", session.getAttribute("user"));
				
				session.setAttribute("userName", userName);
				session.setAttribute("userId", 2);
				session.setAttribute("user", "normal");
				session.setAttribute("adminFlag", "true");
				
				
			}
			req.getRequestDispatcher("userHome.jsp").forward(req, res);
		}else if(userName.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("admin")){
			HttpSession session = req.getSession(true);
			session.setAttribute("userName", userName);
			session.setAttribute("userId", 1);
			session.setAttribute("user","admin");
			req.getRequestDispatcher("adminHome.jsp").forward(req, res);
		}else if(userName.equalsIgnoreCase("saumil") && passWord.equalsIgnoreCase("saumil")){
			
			if(adminFlag.equalsIgnoreCase("")){
				HttpSession session = req.getSession(true);
				session.setAttribute("userName", userName);
				session.setAttribute("userId", 3);
				session.setAttribute("user", "normal");
				
			}else{
				
				HttpSession session = req.getSession();
				session.setAttribute("admin_session_username", session.getAttribute("userName"));
				session.setAttribute("admin_session_userId", session.getAttribute("userId"));
				session.setAttribute("admin_session_user", session.getAttribute("user"));
				
				session.setAttribute("userName", userName);
				session.setAttribute("userId", 3);
				session.setAttribute("user", "normal");
				session.setAttribute("adminFlag", "true");
				
			}
			req.getRequestDispatcher("userHome.jsp").forward(req, res);
		}
	
	}

}

package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/del.do")
public class Del extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//아무것도 없이 그냥 del.jsp를 부르니까 del.jsp에서 아무것도 못함
		
		String seq = req.getParameter("seq");
		String name = req.getParameter("name");
		
		req.setAttribute("seq", seq);
		req.setAttribute("name", name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/del.jsp");
		dispatcher.forward(req, resp);

	}

}
;


package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delok.do")
public class DelOk extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. 데이터 가져오기(seq)
		//2. DB작업 > DAO 위임
		//3. 결과 반환 + JSP 호출
		
		//1. 
		String seq = req.getParameter("seq");
		String name = req.getParameter("name");
		
		//2.
		CodeDAO dao = new CodeDAO();
		
		int result = dao.del(seq);
		
		req.setAttribute("result", result);
		req.setAttribute("name", name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/delok.jsp");
		dispatcher.forward(req, resp);

	}

}


package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginok.do")
public class LoginOk extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. 데이터 가져오기(seq)
		//2. DB 작업 > DAO 위임
		//3. JSP 호출하기 + 2번 결과 전달		
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		
		CodeDAO dao = new CodeDAO();
		
		
		int result = dao.login(id, pw);
		
		MemberDTO dto = dao.getNames(id);
		
		String name = dto.getName();
		
		req.setAttribute("result", result);
		req.setAttribute("name", name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/loginok.jsp");
		dispatcher.forward(req, resp);

	}

}


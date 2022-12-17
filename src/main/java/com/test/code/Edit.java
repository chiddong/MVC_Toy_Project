package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit.do")
public class Edit extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. 데이터 가져오기(seq)
		//2. DB 작업 > DAO 위임
		//3. JSP 호출하기 + 2번 결과 전달
		
		//1.
		String seq = req.getParameter("seq");
		String name = req.getParameter("name");
		
		//2.
		CodeDAO dao = new CodeDAO();
		
		
		//레코드 한줄을 가지고 와야한다.! => 무조건 dto를 떠올릴것!
		CodeDTO dto = dao.get(seq);		
		
		dao.close();
		
		//3.
		req.setAttribute("dto", dto);
		req.setAttribute("name", name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/edit.jsp");
		dispatcher.forward(req, resp);

	}

}


package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editok.do")
public class EditOk extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//한글이 POST방식으로 넘어옴, 1. 인코딩 + 데이터 가져오기
		//2. DB 작업 > DAO 위임
		//3. JSP 전달 + 호출
		
		//1.
		req.setCharacterEncoding("UTF-8");
		
		String seq = req.getParameter("seq");
		String name = req.getParameter("name");
		String language = req.getParameter("language");
		String code = req.getParameter("code");
		String description = req.getParameter("description");
		
		//2.
		CodeDAO dao = new CodeDAO();
		
		CodeDTO dto = new CodeDTO();
		
		dto.setSeq(seq);
		dto.setName(name);
		dto.setLanguage(language);
		dto.setCode(code);
		dto.setDescription(description);
		
		
		//3.
		int result = dao.edit(dto);
		
		req.setAttribute("result", result);
		req.setAttribute("name", name);
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/editok.jsp");
		dispatcher.forward(req, resp);

	}

}

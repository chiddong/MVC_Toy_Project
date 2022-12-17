package com.test.code;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addok.do")
public class AddOk extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. 인코딩 + 데이터 가져오기
		//2. DB작업  > DAO에게 위임(코드분리)
		//3. 결과 > JSP 전달 + 호출
		
		//1.
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String language = req.getParameter("language");
		String code = req.getParameter("code");
		String description = req.getParameter("description");
		
		//2.
		CodeDAO dao = new CodeDAO();
		
		CodeDTO dto = new CodeDTO();
		
		//매개변수가 엄청나게 많아지면 dao에 일일히 다 담기가 힘들다.
		// 때문에 미리 만들어둔 dto 상자 안에 담아서 전달하면 훨씬 좋다!
		// 계층과 계층간의 관계가 심플해짐
		
		dto.setName(name);
		dto.setLanguage(language);
		dto.setCode(code);
		dto.setDescription(description);
		
		
		int result = dao.add(dto);
		
		//3. JSP에게 전달 > req안에 담아라
		req.setAttribute("result", result);
		req.setAttribute("name", name);
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/addok.jsp");
		dispatcher.forward(req, resp);

	}

}


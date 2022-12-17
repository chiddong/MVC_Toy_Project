package com.test.code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list.do")
public class List extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1. select하러 DB 작업 > DAO 위임
		//2. 결과 반환	> JSP 전달
		//3. JSP 호출
		
		File file = new File(req.getRealPath("/word/java.word"));
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		//BufferedReader로 다 읽고 나면 다시 되돌아가기 힘드니까 arraylist에 담는다.
		
		ArrayList<String> words = new ArrayList<String>();
		
		String line = null;
		
		while((line = reader.readLine()) != null) {
			
			words.add(line);
			
		}
		
		reader.close();
		
		
		
		//현재 폴더가 어딘지 모르겠다? 찾는 방법, 
		/*
		 
		req.getRealPath("/word/java.word")
		 > 파일 업로드할때, application.getRealPath 했던거랑 동일한 것
		 
		 
		 C:\class\dev\eclipse\. 
		 
		File a = new File(".");
		System.out.println(a.getAbsolutePath());
		*/
		
		String name = req.getParameter("name");
		
		CodeDAO dao = new CodeDAO();
		
		//데이터 달라고 메소드 호출 > 뭘 돌려받을건데? > ResultSet을 돌려받아야하는데, 그 작업은 DAO를 벗어나면 안되니까 ArrayList로 돌려받는다!
		ArrayList<CodeDTO> list = dao.list(name);
		
		if (list != null) {
			//JSP에게 전달할 데이터 일부를 가공
			for (CodeDTO dto : list) {
	
				//공백 문자 처리
				dto.setCode(dto.getCode().replace("\r\n", "<br>"));
				dto.setCode(dto.getCode().replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;"));
				
				
				//코드 하이라이트
				String code = dto.getCode();
				
				//public class DBUtil {
				//<span style="color:blue;">public</span> class DBUtil{
				
				for (String word : words) {
					code = code.replace(word+" ", "<span style='color: cornflowerblue;'><b>" + word + " </b></span>");
					dto.setCode(code);
				}
				
				
			}
		}
		
		req.setAttribute("list", list);
		req.setAttribute("name", name);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/list.jsp");
		dispatcher.forward(req, resp);

	}

}


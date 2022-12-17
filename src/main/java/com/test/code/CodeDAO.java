package com.test.code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.test.my.DBUtil;

//DAO, Data Access Object
//- 데이터 베이스 관련 코드 담당자
//- JDBC 코드를 담당하는 클래스
//- ***** DAO 이외의 클래스에서 JDBC 코드가 발견되면 안된다.

public class CodeDAO {
	
	private Connection conn = null;
	private Statement stat = null;
	private PreparedStatement pstat = null;
	private ResultSet rs = null;
	
	public CodeDAO() {
			
		conn = DBUtil.open();
		
		
	}
	
	public void close() {
		
		try {
			conn.close();			
		} catch (Exception e) {
			System.out.println("CodeDAO.close");
			e.printStackTrace();
		}
	
	}

	public int add(CodeDTO dto) {
		
		//DB는 이미 연결되어 있음
		
		try {
			
			String sql = "insert into tblCode (seq, name, language, code, description, regdate) values (seqCode.nextVal, ?, ?, ?, ?, default)";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getLanguage());
			pstat.setString(3, dto.getCode());
			pstat.setString(4, dto.getDescription());
			
			return pstat.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("CodeDAO.add");
			e.printStackTrace();
		}
		
		return 0;
	}

	public ArrayList<CodeDTO> list(String name) {
		
		try {
			
			String sql = "select * from tblCode where name=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, name);
			
			rs = pstat.executeQuery();
			
			//ResultSet > ArrayList<CodeDTO>
			
			ArrayList<CodeDTO> list = new ArrayList<CodeDTO>();
			
			while (rs.next()) {
				
				//레코드 1개 > CodeDTO 1개
				CodeDTO dto = new CodeDTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setLanguage(rs.getString("language"));
				dto.setCode(rs.getString("code"));
				dto.setDescription(rs.getString("description"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
				
			}
			
			return list;
			
			
		} catch (Exception e) {
			System.out.println("CodeDAO.list");
			e.printStackTrace();
		}
		
		return null;
	}

	public CodeDTO get(String seq) {
		
		try {
			
			String sql = "select * from tblCode where seq=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, seq);
			
			rs = pstat.executeQuery();
			
			//레코드 1줄 DTO에 담아야한다.
			
			if (rs.next()) {
				
				CodeDTO dto = new CodeDTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setLanguage(rs.getString("language"));
				dto.setCode(rs.getString("code"));
				dto.setDescription(rs.getString("description"));
				dto.setRegdate(rs.getString("regdate"));
				
				return dto;
				
				
			}
			
			
		} catch (Exception e) {
			System.out.println("CodeDAO.get");
			e.printStackTrace();
		}
		
		return null;
	}

	public int edit(CodeDTO dto) {
		
		try {
			
			String sql = "update tblCode set name=?, language=?, code=?, description=? where seq=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getLanguage());
			pstat.setString(3, dto.getCode());
			pstat.setString(4, dto.getDescription());
			pstat.setString(5, dto.getSeq());
			
			return pstat.executeUpdate();
			

			
		} catch (Exception e) {
			System.out.println("CodeDAO.edit");
			e.printStackTrace();
		}
		
		return 0;
	}

	public int del(String seq) {
		
		try {
			
			String sql = "delete from tblCode where seq=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, seq);
			
			return pstat.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("CodeDAO.del");
			e.printStackTrace();
		}
		
		return 0;
	}

	public int login(String id, String pw) { 
		
		try {
			
			String sql = "select count(*) from tblCMem where id=? and pw=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, id);
			pstat.setString(2, pw);
			
			return pstat.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("CodeDAO.login");
			e.printStackTrace();
		}
		
		return 0;
	}

	public MemberDTO getNames(String id) {
		
		try {
			
			String sql = "select * from tblCMem where id=?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, id);
			rs = pstat.executeQuery();
			
			//레코드 1줄 DTO에 담아야한다.
			
			if (rs.next()) {
				
				MemberDTO dto = new MemberDTO();
				
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				
				return dto;
			
			}
		
			
		} catch (Exception e) {
			System.out.println("CodeDAO.getNmae");
			e.printStackTrace();
		}
		
		return null;
	}



}






















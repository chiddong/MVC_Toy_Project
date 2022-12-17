package com.test.code;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//DTO, VO == 데이터베이스의 테이블 1개에 해당하는 자료형
//테이블 단위의 데이터는 테이블 단위로 옮긴다.
//테이블의 컬럼값을 멤버변수로 가져오는 게 좋다.

//	> 멤버 변수, Getter, Setter	> 여기까지 만든걸 DTO, VO라고한다.
// 편의
//	> 생성자, toString() 가능


//Lombok
//- 클래스의 자주 사용하는 기능들(Getter, Setter, 생성자, toString()) 자동으로 생성해주는 라이브러리
//- 어노테이션을 사용한다.


@Data
public class CodeDTO {

	private String seq;
	private String code;
	private String description;
	private String name;
	private String language;
	private String regdate;
	
	
}

















# MVC_Toy_Project👩‍💻


## Summary
- MVC모델을 이용한 익명 게시판입니다.

&nbsp;
&nbsp;

### ✨프로젝트 목적
1.  MVC모델을 이용하여 코드 스니핏 사이트를 만든다.
2.  본인이 작성한 코드만을 볼 수 있으며, 로그인 후에 사용 가능하다.


&nbsp;
&nbsp;

### ✨주요기능
☑️ 회원 가입

☑️ 로그인

☑️ 게시물 CRUD



&nbsp;
&nbsp;

### ✨ 사용 기술
| 기술분야 | 상세내용 |
| ------ | ------ |
| Front-end | HTML5, CSS, JQuery, JavaScript |
| Back-end | JAVA, JSP, Servlet |
| Server | Apache Tomcat |
| DB | Oracle, SQL |

&nbsp;
 &nbsp;     

### ✨ 담당 업무
- **전체** 
     1. 회원가입
     2. 로그인
     3. 게시물 CRUD

&nbsp;
&nbsp;
&nbsp;

 ### ✨구현 화면
&nbsp;
&nbsp;


#### ✅ _메인화면_
<img width="1280" alt="메인화면" src="https://user-images.githubusercontent.com/111338981/212660404-323103d5-31cc-4b7c-9525-c42614f85103.png">
&nbsp;
&nbsp;
- __내용__
 

    코드 스니핏 사이트의 메인 화면입니다.
    회원의 아이디와 비밀번호를 입력하여 로그인할 수 있습니다.





- __기술__
     ###### Session, JDBC, JSP, Servlet 
     회원의 ID, PW를 입력 받아 입력 값을 DB에 저장된 회원 정보와 비교한 후에 일치하는 경우
     회원 정보를 session에 저장합니다.




&nbsp;
&nbsp;
&nbsp;   


#### ✅ _회원 로그인 후_
<img width="1280" alt="회원로그인 - 아무것도 없을때" src="https://user-images.githubusercontent.com/111338981/212660427-57247f10-ce38-4a3a-ba88-cd4a508dd4ba.png">
&nbsp;
&nbsp;


#### ✅ _등록 코드 있을 때_
<img width="1280" alt="회원로그인 - 등록한 코드 있을때" src="https://user-images.githubusercontent.com/111338981/212660410-8de9546e-dc17-4a69-a013-226ea3bcdd60.png">
&nbsp;
<img width="1280" alt="회원로그인 - 등록한 코드 있을때2" src="https://user-images.githubusercontent.com/111338981/212660416-0b4e5b83-a0e1-4e7d-b758-2ad626d71b90.png">
&nbsp;
&nbsp;
- __내용__
 

    회원이 로그인한 후 본인이 작성한 게시물을 목록으로 출력해주었습니다.




- __기술__
     ###### Session, JDBC, JSP, Servlet
     Session에 저장된 auth값을 확인하여, 본인이 작성한 게시물을 DB에서 Select하여
     출력해주었습니다.
     처음에는 Servlet과 JSP로 Model, View, Controller를 나누어 작업하는 것이 익숙하지 않아 
     조금 헤맸지만, 해당 기능 구현을 통해 작동 원리에 대해서 정리할 수 있었습니다.




&nbsp;
&nbsp;
&nbsp;   

#### ✅ _작성하기_
<img width="1280" alt="회원로그인- 작성하기" src="https://user-images.githubusercontent.com/111338981/212660430-7eaa2c02-14cd-4048-8adc-a18392bb3f5b.png">
&nbsp;
&nbsp;
- __내용__
 

    로그인한 회원이 게시물을 작성하는 화면입니다.
    이때, 작성자는 자동으로 입력되며, 코드의 언어를 선택하여 작성 할 수 있습니다.





- __기술__
     ###### Session, JDBC, JSP, Servlet 
     Session에 저장된 회원 정보를 통해 작성자를 자동으로 입력하고, 언어 선택 후에 코드를
     작성하면, 해당 데이터를 addok.java로 이동하여 DB에 Insert하였습니다.
     앞선 조회와 마찬가지로 java로 이동하여, 데이터를 처리하고 다시 JSP로 넘기는 방식에 대해
     다시 한번 더 정리할 수 있었습니다.





&nbsp;
&nbsp;
&nbsp;   

#### ✅ _수정하기_
<img width="863" alt="회원 로그인 - 수정하기" src="https://user-images.githubusercontent.com/111338981/212660409-034e6afa-d821-44ec-93b9-3764710324ff.png">
&nbsp;
&nbsp;
- __내용__
 

    로그인한 회원이 게시물을 수정하는 화면입니다.
    이때, 언어는 자동으로 입력됩니다.




- __기술__
     ###### Session, JDBC, JSP, Servlet 
     Session에 저장된 회원 정보를 통해 작성자를 자동으로 입력하고, 언어 선택 후에 코드를
     작성하면, 해당 데이터를 editok.java로 이동하여 DB에 Update하였습니다.



&nbsp;
&nbsp;
&nbsp;   

#### ✅ _삭제하기_
<img width="1280" alt="회원로그인 - 삭제하기" src="https://user-images.githubusercontent.com/111338981/212660422-5866aa05-3648-47e7-be1d-dda5e1a0c316.png">
&nbsp;
&nbsp;


- __내용__
 

    로그인한 회원이 게시물 삭제하기 클릭 시 나타나는 화면입니다.





- __기술__
     ###### Session, JDBC, JSP, Servlet 
     Session에 저장된 회원 정보를 통해 작성자를 자동으로 입력하고, 언어 선택 후에 코드를
     작성하면, 해당 데이터를 deleteok.java로 이동하여 DB에 Delete하였습니다.






&nbsp;
&nbsp;
&nbsp;
     
 ### ✨프로젝트를 통해
 
 ### MVC Model 의 편리함을 알게 된 프로젝트

    이전에 JSP Model1에 대해서 배운 이후에 Model, View, Controller를 각각 분리하여 구현 하는 MVC Model을 배우게 되었습니다.

    처음에는 Servlet과 JSP를 분리하여 각각 이름을 맞추어 JSP Model1보다 
    많은 양의 파일이 생성된다는 점에서 MVC Model을 사용하는 이유에 대해 정확하게 알지 못하였습니다.
    하지만, 기능 구현을 하면서 각각의 기능에 맞춰 필요한 JSP 파일만을 생성하고 Servlet 을 기능에 따라 각각 분리함으로써 오류가 발생하거나, 
    코드를 수정/관리 해야 할 때 훨씬 편리하다는 것을 느낄 수 있었습니다.

    토이 프로젝트를 진행하는 것도 중요하다는 것을 깨닫게 되었습니다.
    이론 공부만 했을 때는 다소 헷갈렸던 부분들이 직접 토이 프로젝트를 기획하고 진행해보니 
    훨씬 더 명확하게 이해할 수 있었습니다.

    개인 토이 프로젝트 진행을 통해 MVC Model 정리를 확실하게 할 수 있었고, 
    기능에 따라 코드를 분리해서 작성하는 것이 코드 관리에 용이하다는 점을 배울 수 있었습니다.


 
&nbsp;
&nbsp;
---
&nbsp;
&nbsp;
###### _프로젝트 기간_
- 2022.12.22


###### _프로젝트 참여인원_
- 1명



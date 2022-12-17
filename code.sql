
-- code.sql

create table tblCode (

    seq number primary key,                 -- 번호(PK)
    code varchar2(1000) not null,           -- 코드조각(등록할)
    description varchar2(1000) not null,    -- 코드설명
    name varchar2(30) not null,             -- 작성자
    language varchar2(50) not null,         -- 언어종류(원래는 빼야함, 반복적인 값이니)
    regdate date default sysdate not null
);

create sequence seqCode;

drop sequence seqCode;
drop table tblCode;

delete from tblCode where seq=4;

select * from tblCode;


create table tblCMem (
    
    id varchar2(30) primary key,
    pw varchar2(30) not null,
    name varchar2(30) not null
    
);

create sequence seqCMem;

select * from tblCMem;

insert into tblCMem(id, pw, name) values ('cha', '1234', '차은우');
insert into tblCMem(id, pw, name) values ('hong', '1234', '홍길동');
insert into tblCMem(id, pw, name) values ('kim', '1234', '김지현');
insert into tblCMem(id, pw, name) values ('jeon', '1234', '전지현');

select * from tblCMem where name='차은우';

commit;


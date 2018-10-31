package com.example.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.member.MemberVO;

@Repository //현재 클래스를 스프링에서 관리하는 dao bean으로 등록
public class MemberDAOImpl implements MemberDAO{
	//SqlSession 객체를 스프링에서 생성해서 주입
	//의존관계 주입(Dependency Injection), 느슨한 결합
	@Inject
	SqlSession sqlSession; //mybatis실행 객체
	
	//01_01. 회원 로그인 체크
	@Override
	public boolean loginCheck(MemberVO vo){
		String name = sqlSession.selectOne("member.loginCheck",vo);
		return (name==null)?false:true;
	}
	//01_02. 회원 로그인 정보
	@Override
	public MemberVO viewMember(MemberVO vo){
		return sqlSession.selectOne("member.viewMember",vo);
	}
	@Override
	public void logout(HttpSession session){
		
	}
}
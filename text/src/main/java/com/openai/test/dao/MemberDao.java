package com.openai.test.dao;

import com.openai.test.dto.MemberDto;

public interface MemberDao {
	
	public void joinMember(MemberDto dto);
	
	public int LoginProc(MemberDto dto);
	
	public MemberDto getInfo(MemberDto dto);
	
	public void updateProc(MemberDto dto);
	
	public void deleteProc(MemberDto dto);
	
	//관리자 로그인 
	public int admloginProc(MemberDto dto);
	
	
	
	
}

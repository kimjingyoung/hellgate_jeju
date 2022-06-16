package com.openai.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.openai.test.dao.MemberDao;
import com.openai.test.dto.MemberDto;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
//예는 root-context찾아 가는 얘임
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log
public class DaoTest {
	@Autowired
	MemberDao mDao;
	
	@Test
	public void testInsert() {
		MemberDto member = new MemberDto();
		member.setM_id("namnami");
		member.setM_name("김진갱");
		member.setM_pwd("happy");
		member.setM_age(26);
		member.setM_addr("인천광역시");
		
		try {
			log.info("성공이다이자시가!");
		}catch (Exception e) {
			log.info("삽입실패다이자시가!");
		}
	}
	
}

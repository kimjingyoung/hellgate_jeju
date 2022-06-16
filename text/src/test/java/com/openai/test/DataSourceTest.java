package com.openai.test;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.java.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //test를 위한 기본적인 작성
@Log
public class DataSourceTest {
	@Autowired
	DataSource dataSource;
	
	@Test   //데이터 베이스에 접속이 되는지 테스트
	public void testConnection() {
		try(Connection conn = dataSource.getConnection()){
			log.info("접송성공이다이자시가");
		}catch (Exception e) {
			e.printStackTrace();
			log.info("접속실패다이자시가");
		}
	}
	
	

}

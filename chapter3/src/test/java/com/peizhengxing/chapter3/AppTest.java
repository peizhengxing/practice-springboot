package com.peizhengxing.chapter3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AppTest{
	@Autowired
	@Qualifier("primaryTemplate")
	protected JdbcTemplate jdbcTemplate1;
	
	@Autowired
	@Qualifier("secondTemplate")
	protected JdbcTemplate jdbcTemplate2;
	
	@Before
	public void setUp(){
		jdbcTemplate1.update("DELETE FROM USER");
		jdbcTemplate2.update("DELETE FROM USER");
	}
	
	@Test
	public void test() throws Exception{
		jdbcTemplate1.update("insert into user(id,name,age) values(?,?,?)",1,"aaa",20);
		jdbcTemplate1.update("insert into user(id,name,age) values(?,?,?)",2,"bbb",23);
		
		jdbcTemplate2.update("insert into user(id,name,age) values(?,?,?)",2,"bbb",23);
		
		Assert.assertEquals("2", jdbcTemplate1.queryForObject("select count(1) from USER ", String.class));
		Assert.assertEquals("1", jdbcTemplate2.queryForObject("select count(1) from USER ", String.class));
	}
}
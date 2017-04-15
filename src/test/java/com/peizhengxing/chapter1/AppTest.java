package com.peizhengxing.chapter1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.peizhengxing.chapter1.service.BlogProperties;
/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
//@WebAppConfiguration
public class AppTest {
	//private MockMvc mvc;
	
	private static final Log log = LogFactory.getLog(AppTest.class);
	
	@Autowired
	private BlogProperties blogProperties;

//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new Example()).build();
//	}

//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("Hello World")));
//	}
	
	@Test
	public void test1() throws Exception{
		Assert.assertEquals("callback初识", blogProperties.getName());
		Assert.assertEquals("callback study others Spring Boot", blogProperties.getTitle());
		Assert.assertEquals("callback初识 one don't hava any knowleage, but he wants to try and do callback study others Spring Boot", blogProperties.getDesc());
	
		log.info("随机数测试输出：");
		log.info("随机字符串 : " + blogProperties.getValue());
		log.info("随机int : " + blogProperties.getNum());
		log.info("随机long : " + blogProperties.getBignum());
		log.info("随机10以下 : " + blogProperties.getTest1());
		log.info("随机10-20 : " + blogProperties.getTest2());

	}
}

package com.peizhengxing.chapter1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.peizhengxing.chapter1.controller.Example;
import com.peizhengxing.chapter1.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class RestfulTest {

	private MockMvc mvc;
	
	@Before
	public void setUp() throws Exception{
		mvc = MockMvcBuilders.standaloneSetup(new Example(),new UserController()).build();
	}
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void hello() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
		   .andExpect(status().isOk())
		   .andExpect(content().string(equalTo("Hello World")));
	}
	
	@Test
	public void testUserController() throws Exception{
		RequestBuilder request = null;
		request = get("/users/");
		mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
		
		request = post("/users/").param("id", "1").param("name", "测试大师").param("age", "27");
	    mvc.perform(request).andExpect(content().string(equalTo("success")));
	    
	    request = get("/users/");
	    mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":27}]")));
	    
	    request = put("/users/1").param("name", "ceshizhongjidashi").param("age", "28");
	    mvc.perform(request).andExpect(content().string(equalTo("success")));

	    request = get("/users/1");
	    mvc.perform(request).andExpect(content().string(equalTo("{\"id\":1,\"name\":\"ceshizhongjidashi\",\"age\":28}")));
	    
	    request = delete("/users/1");
	    mvc.perform(request).andExpect(content().string(equalTo("success")));
	    
	    request = get("/users/");
		mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
		
	}
}

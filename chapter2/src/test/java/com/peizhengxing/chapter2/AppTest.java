package com.peizhengxing.chapter2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.peizhengxing.chapter2.domain.User;
import com.peizhengxing.chapter2.domain.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class AppTest {
   
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test() throws Exception{
		userRepository.save(new User("AAA",10));
		userRepository.save(new User("BBB",20));
		userRepository.save(new User("CCC",30));
		userRepository.save(new User("DDD",40));
		userRepository.save(new User("EEE",50));
		userRepository.save(new User("FFF",60));
		
		Assert.assertEquals(6, userRepository.findAll().size());
		Assert.assertEquals(20, userRepository.findByName("BBB").getAge().intValue());
		Assert.assertEquals(20, userRepository.findUser("BBB").getAge().intValue());
		Assert.assertEquals(20, userRepository.findByNameAndAge("BBB", 20).getAge().intValue());
		
		userRepository.delete(userRepository.findByName("BBB"));
		
		Assert.assertEquals(5, userRepository.findAll().size());
	}
}

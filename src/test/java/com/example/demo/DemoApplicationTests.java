package com.example.demo;

import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dao.vo.ProductInfo;
import com.example.demo.dao.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {


	}

	@Test
	/*@Transactional
	@Rollback(false)*/
	public void testUser(){

		Iterable<User> all = userRepository.findAll();
		Iterator<User> iterator = all.iterator();
		while (iterator.hasNext()){
			User user = iterator.next();
			if(user.getProductInfos() != null){
				List<ProductInfo> productInfos = user.getProductInfos();
				System.out.println(productInfos.size());
			}
		}


		/*List<User> age = userRepository.findAll(new Sort(Sort.Direction.DESC, "age"));
		System.out.println(age.size());*/

//		userRepository.insertUser(6,"sdg");
		/*List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setAddress("zj");
		user1.setAge(30);
		user1.setUseName("abc");
		user1.setPassword("dsgseg");

		User user2 = new User();
		user2.setAddress("zjgk");
		user2.setAge(39);
		user2.setUseName("ddd");
		user2.setPassword("dsg3333seg");

		users.add(user1);
		users.add(user2);


		userRepository.saveAll(users);*/

		/*Iterable<User> all = userRepository.findAll();
		Iterator<User> iterator = all.iterator();

		while(iterator.hasNext()){
			User user = iterator.next();
			System.out.println(user.getAddress());
		}*/
	}

}

package com.example.demo;

import com.example.demo.context.PropertiesBean;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dao.vo.User;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
//@PropertySource("demo.properties")
@Controller
public class DemoApplication {
	/*@Value("${cls.name}")
	private String name;*/

	@Autowired
	private PropertiesBean propertiesBean;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return propertiesBean.getAddress();
	}

	@RequestMapping("/")
	public String index(Model model){
		Person single = new Person("cls",29);
		List<Person> people = new ArrayList<>();
		Person p1 = new Person("p1", 22);
		Person p2 = new Person("p2", 23);
		Person p3 = new Person("p3", 24);

		Iterable<User> all = userRepository.findAll();
		Iterator<User> iterator = all.iterator();

		while(iterator.hasNext()){
			User user = iterator.next();
			System.out.println(user.getAddress());
		}

		people.add(p1);
		people.add(p2);
		people.add(p3);

		model.addAttribute("people", people);
		model.addAttribute("singlePerson", single);

		return "index";
	}



}

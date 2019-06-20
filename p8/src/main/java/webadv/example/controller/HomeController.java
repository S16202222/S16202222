package webadv.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webadv.example.repository.TeacherRepository;

@Controller
public class HomeController {	
	@Autowired
	private TeacherRepository tr;	
	@RequestMapping("/loginba")
	public String login(String account, String password) {
		if("abc".equals(account)&&"123".equals(password)) {
			System.out.println("µÇÂ¼³É¹¦");
			return "home";
		}
		System.out.println("µÇÂ¼Ê§°Ü");
		return "index";
	}
	
	

//	@RequestMapping("/home")
//	public String home() {	
//			return "home";
//	}
}

package webadv.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeworkController {
	
	@RequestMapping(value="/NewFile",method=RequestMethod.GET)
	public String homework() {
		return "homeworkcorrecting";
	}

}

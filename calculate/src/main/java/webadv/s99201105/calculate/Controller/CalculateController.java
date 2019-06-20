package webadv.s99201105.calculate.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculateController {

	@RequestMapping(value="/home1",method=RequestMethod.POST)
	public String text(int ans,int a) {
		if(ans==a)
			return "Success";
					
		
		
		

		
		return "Fail";
	}

//	@GetMapping("/")
//	public String index(Model model) {
//		model.addAttribute("num1",num1);
//		model.addAttribute("num2",num2);
//		
//		return "home";
//	}
}

package webadv.s99201105.AssistantS;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




//@Controller
//public class HomeController {
//	@GetMapping("/login")
//	public String login(Model model,String account,String password) {
//			
//			return "login";
//	}
//	
//
//	@GetMapping("/assistant")
//	public String assistant(Model model,String account,String password) {
//			if ("abc".equals(account) && "123".equals(password))
//				return "assistant";
//			return "loginerror";
//	}
//	public String home(Model model) {
//		return "b";
//	}
//}
@Controller
public class HomeController {	

	@PostMapping("/login")
	public String login(String account, String password) {
		return null;
	}
	
	@GetMapping("/home")
	public String home() {	
			return "home";
	}
}

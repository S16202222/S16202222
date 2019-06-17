package controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CalculateController {
	@RequestMapping(value="/Home1")
	public String text(int ans,int a) {
		if(ans==a)
			return "Success";
					
		
		
		
		
		
		return "Fail";
	}
}

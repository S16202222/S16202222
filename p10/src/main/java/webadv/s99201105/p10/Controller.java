package webadv.s99201105.p10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	@GetMapping(value="/hello",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String hello() {
		return "<h1>Hello,Spring...</h1>";
	}
}

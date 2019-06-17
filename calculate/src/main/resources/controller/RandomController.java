package controller;
import java.math.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import repository.CalculateRepository;
@Controller
public class RandomController {
	private int a;
	private int b;
	private int c;
	private int ans;
	private int temp;
	private String f;
	@RequestMapping(value="/Home")
	public ModelAndView startpage() {
	CalculateRepository cr=new CalculateRepository();
	ModelMap map=new ModelMap();
	
	a=(int) (1+Math.random()*10);
	b=(int) (1+Math.random()*10);
	c=(int) (1+Math.random()*3);
	if(b>a) {
		temp=b;
		b=a;
		a=temp;
	}
	if(c==1)
		ans=a+b;
	if(c==2)
		ans=a-b;
	if(c==3)
		ans=a*b;
	
	if(c==1)
		f="+";
	if(c==2)
		f="-";
	if(c==3)
		f="*";
	cr.setNum1(a);
	cr.setNum2(b);
	cr.setX(f);
	cr.setAns(ans);
	map.put("cr",cr);
	return new ModelAndView("Home",map);
	}
	
}

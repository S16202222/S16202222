package webadv.s99201105.calculate.Controller;

import java.math.*;
import webadv.s99201105.calculate.repository.TrueRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webadv.s99201105.calculate.repository.CalculateRepository;

@Controller
public class RandomController {
	private int a;
	private int b;
	private int c;
	private int d;
	private int ranid;
	private String f;
	private TrueRepository repository;	
	@RequestMapping(value="/")
	public ModelAndView startpage() {
	CalculateRepository cr=new CalculateRepository();
	ModelMap map=new ModelMap();
	ranid=(int) (1+Math.random()*5);
	repository.FindTimu(ranid);
//	a=(int) (1+Math.random()*10);
//	b=(int) (1+Math.random()*10);
//	c=(int) (1+Math.random()*3);
//	if(b>a) {
//		temp=b;
//		b=a;
//		a=temp;
//	}
//	if(c==1)
//		ans=a+b;
//	if(c==2)
//		ans=a-b;
//	if(c==3)
//		ans=a*b;
	
	
	cr.setA(a);
	cr.setB(b);
	cr.setC(c);
	cr.setD(d);
	map.put("cr",cr);
	return new ModelAndView("index",map);
	}
	
}

package webadv.s99201105.calculate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.HelloWorld;

public class MainApp {
    public static void main(String[] args) {
       ApplicationContext context = 
            new ClassPathXmlApplicationContext("Beans.xml");    
       CalculateApplication obj = (CalculateApplication) context.getBean("helloWorld"); 
       obj.getMessage();
    }
}
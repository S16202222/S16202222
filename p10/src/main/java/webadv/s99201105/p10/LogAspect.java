package webadv.s99201105.p10;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution( * webadv.s99201105.p10.TeacherRepository.*(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void log(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		System.out.println("the method [" + methodName + "] begins with " + Arrays.asList(jp.getArgs()));
	}
		
}


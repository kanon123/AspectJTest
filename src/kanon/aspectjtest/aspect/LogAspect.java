package kanon.aspectjtest.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogAspect
{	       
    @Pointcut("execution(* kanon.aspectjtest.entities.User.* (..))")
    public void pointcut(){	
	
    }
    @Before("pointcut()")
    public void beforeToString(){
	System.out.println("before toString");
    }
}

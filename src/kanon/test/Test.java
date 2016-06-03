package kanon.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kanon.aspectjtest.entities.User;

public class Test
{
    public static void main(String[] args)
    {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
	User user = (User) ctx.getBean("user");
	user.sayInfo();
    }
}

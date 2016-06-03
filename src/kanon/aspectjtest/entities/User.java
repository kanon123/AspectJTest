package kanon.aspectjtest.entities;

import org.springframework.stereotype.Component;

@Component("user")
public class User
{
    private String name;
    private Integer age;
    public User()
    {
	super();
    }
    public User(String name, Integer age)
    {
	super();
	this.name = name;
	this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void sayInfo()
    {
	System.out.println("User [name=" + name + ", age=" + age + "]");
    }
    
}

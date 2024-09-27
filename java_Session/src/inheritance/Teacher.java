package inheritance;

public class Teacher extends person 
{
	String subject;
	 public void setsubject1(String subject) 
	 {
	        this.subject = subject;
	    }
	    public void display()
	    {
	    	 System.out.println("Name: " + name + ", Age: " + age + ", Subject: " + subject);
	    }
	}



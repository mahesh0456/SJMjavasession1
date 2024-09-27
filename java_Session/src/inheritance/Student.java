package inheritance;

public class Student extends person 
{
	String grade ;
	
	public void set1 (String grade)
	{
	this.grade = grade ;
}
	 public void display()
	 {
		   System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
	  }
}




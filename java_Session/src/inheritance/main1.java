package inheritance;

public class main1 
{
		  public static void main(String[] args) 
		  {
			  person p = new person();
			  p.set("suma", 29);
			  p.display();
			  
			  System.out.println("Student details");
			  Student s = new Student();
			  s.set1("A");
			  s.set("ravindra", 36);
			  s.display(); 
			  
			  System.out.println("teacher details");
			   Teacher t = new Teacher();
			   t.set("tejas", 25);
			   t.setsubject1("java");
			   t.display();
			   
		  }
	  }


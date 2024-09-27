package java_code_session;

	public class Person1 {
	    private String name;
	    private int age;
	    private String gender;
	    public Person1(String name, int age, String gender) { // Constructor to initialize name, age, and gender
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getGender() {
	        return gender;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
	    }
	    public static void main(String[] args) 
	    {
	    	
	        Person1 person1 = new Person1("dhanajayan", 31, "male");

	        person1.displayInfo();
            person1.setAge(32);
	        person1.displayInfo();
	    }
	}


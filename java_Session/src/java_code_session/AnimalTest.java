package java_code_session;
  class Animal {
	   void sound()
	    {
	    	System.out.println("parent");
	    }
	}
	class Dog extends Animal {
	    void sound() {
	        System.out.println("Bark");
	    }
	}
	class Cat extends Animal {
	    void sound() {
	        System.out.println("Meow");
	    }
	}
	class Lion extends Animal {
	    void sound() {
	        System.out.println("Roar");
	    }
	}
	public class AnimalTest {
	    public static void main(String[] args) 
	    {
	    	 Animal[] animals = new Animal[3];
	        animals[0] = new Dog();
	        animals[1] = new Cat();
	        animals[2] = new Lion();
	        for (Animal animal : animals) // Iterate over the array and call sound() on each object
	        {
	            animal.sound(); // Polymorphism in action
	        }
	    }
	}




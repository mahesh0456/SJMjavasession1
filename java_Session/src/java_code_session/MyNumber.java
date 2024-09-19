package java_code_session;

	public class MyNumber {
	   
	    private int number;

	    
	    public MyNumber(int number) {
	        this.number = number;
	    }

	   
	    public int getNumber() {
	        return number;
	    }

	    
	    public boolean isDivisibleBy3() {
	        return number % 3 == 0;
	    }

	  
	    public static void main(String[] args) {
	        MyNumber myNum = new MyNumber(9);
	        System.out.println("Number: " + myNum.getNumber());
	        System.out.println("Is divisible by 3: " + myNum.isDivisibleBy3());
	    }
	}


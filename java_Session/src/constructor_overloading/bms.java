package constructor_overloading;

public class bms
{
      public bms (int a)
      {
    	  System.out.println("book the tickets"+a);
      }
      public bms (String b)
      {
    	  System.out.println("book the tickets with the movie name "+b);
      }
      public bms (int c,String d)
      {
    	  System.out.println("book the tickets by price and movie name "+c+""+d);
      }
      public bms (String e,int f)
      {
    	  System.out.println("book the tickets by the threater name and price "+e+""+f);
      }
}

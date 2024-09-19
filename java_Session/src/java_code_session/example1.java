package java_code_session;

public class example1 {

	public static void main(String[] args) 
	{
		String s1 = "javamava";
		System.out.println(s1.concat("MAVA"));
		System.out.println(s1.startsWith("ja"));
		System.out.println(s1.endsWith("av"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(4));
		System.out.println(s1.length());
		System.out.println(s1.replace('a', '0'));
		System.out.println(s1.replaceAll("java", "halwa"));
		System.out.println(s1.isEmpty());
		

	}

}

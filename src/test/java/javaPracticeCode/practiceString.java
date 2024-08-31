package javaPracticeCode;

public class practiceString {

	public static void main(java.lang.String[] args) {
		//string is an object in java
		//in both the it points the same object
		String s = "Hello";
		String s2 = "Hello";
		
		
		
		
		//every time it creates a object in heap memeory
		String s3 = new String("hello");
		String s6 = new String("hello");
		
		
		
		
		//string splitting
		String s4 = "Hello anik how are you?";
		
		String[] splittedString = s4.split(" "); //splitted  white space wise
		
		System.out.println("Splitted strings white space wise");
		for(String e:splittedString) {
			System.out.println(e);
		}
		
		
		System.out.println("splitted string using a ");
		String[] splittedString2 = s4.split("anik");
		for(String h:splittedString2) {
			System.out.println(h);
		}
		System.out.println(splittedString2[1].trim());//removing white space
		System.out.println(splittedString2[0].trim());//removing white space
		
		
		//printing all char in a string 
		System.out.println("char at s4 0th index");
		System.out.println(s4.charAt(0));
		
		
		//printing all char in a string 
		for(int i=0; i<s4.length();i++) {
			System.out.print(s4.charAt(i));
		}
		
		System.out.println();
		//print reverse
		for(int i=s4.length()-1; i>=0;i--) {
			System.out.print(s4.charAt(i));
		}
		

	}

}

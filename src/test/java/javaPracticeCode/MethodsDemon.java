package javaPracticeCode;

public class MethodsDemon {

	
	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//object creation
		MethodsDemon d = new MethodsDemon();
		d.DemoMsg();
		
		//static keyword  use from  same class
		DemoMessage();
		
		//accessing form another class
		MethodDemo2 d2 = new MethodDemo2();
		d2.demo2();

	}
	
	public void DemoMsg() {
		
		System.out.println("Hello from methods DemoMsg");
	}
	
	public static void DemoMessage() {
		System.out.println("accessing without creating class using static keyword");
	}

}

package javaPracticeCode;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(practiceString[] args) {
		// TODO Auto-generated method stub
		//array declearation 
		int[] arr = new int[5];
		//assigning 21 in index 0
		arr[0] = 21;
		//printing the assigned value
		System.out.println(arr[0]);
		
		
		//array declearation methode 
		int[] arr3 = {22,33,44,55,66};
		
	for(int i=0; i<5; i++) {
		
		arr[i]=i;
		System.out.println(arr[i]);
	
	}
	
	
	System.out.println("==============");
	
	for(int i=0; i<arr3.length; i++) {
		
		System.out.println(arr3[i]);
		
	}
	
	
	
	//string array
	
	String[] s = {"anik","ashik","koli","sakib"};
	
	for(int i=0; i<s.length; i++) {
		
		System.out.println(s[i]);
	}
	
	
	for(String i: s) {
		
		System.out.println(i);
	}
	
	
	
	//dynamically grow the size of an arry - > array list
		
	ArrayList<String> a = new ArrayList<String>();
	a.add("anik");
	a.add("rakib");
	System.out.println(a.get(1));

		
		
		
	}

}

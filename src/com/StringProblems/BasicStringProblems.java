package com.StringProblems;

public class BasicStringProblems {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Kodnest");
		
		str1.append("Tech");
		System.out.println(str1); // KodnestTech
		System.out.println(str1.capacity());
		
		System.out.println(str1.indexOf("T"));
		System.out.println(str1.charAt(5));
		System.out.println(str1.length());
		System.out.println(str1.insert(7, "PVT"));
		System.out.println(str1.reverse());
		System.out.println(str1.reverse());
		System.out.println(str1.delete(8, 11));
		System.out.println( str1.deleteCharAt(7));
		str1.setCharAt(7, 'j');
		System.out.println(str1);
		str1.trimToSize();
		System.out.println(str1);
		str1.insert(0, 'k');//push one step a head
		System.out.println(str1);
		String str = "hi Hello";
		char []arr = str.toCharArray();
		int j = arr.length-1;
		for( int i = 0; i < j; i++, j-- ) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		System.out.println("Revrsed string " + str);
	}

}

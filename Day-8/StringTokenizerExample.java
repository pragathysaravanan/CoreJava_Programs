package com.day8;
//split the string into token
//" " -->delimeter
import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String s1 = new String("Welcom to Celcom solutons");
		StringTokenizer st = new StringTokenizer(s1, " ");
		
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}

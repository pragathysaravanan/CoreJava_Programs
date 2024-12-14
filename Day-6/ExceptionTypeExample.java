package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Types of exception
public class ExceptionTypeExample {

	public static void main(String a) throws FileNotFoundException {
		// checked Exception

		FileReader fr = new FileReader("file.txt");

	}
}
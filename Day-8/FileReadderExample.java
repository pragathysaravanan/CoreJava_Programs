package com.day8;

import java.io.FileReader;
import java.io.IOException;

public class FileReadderExample {

	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("D:\\FileReadreSample.txt");
	int ch;
	while ((ch =  fr.read())!= -1) {
		System.out.print((char)ch);
	}
	}

}

package com.day8;



import java.io.FileReader;
import java.io.IOException;


class Sample{
	static void file() throws IOException  {
		FileReader fr = new FileReader("D:\\FileReadreSample.txt");
		int ch;
		while ((ch =  fr.read())!= -1) {
			System.out.print((char)ch);
	}
}
}
public class FileReadderExample2 {

	public static void main(String[] args)  {
	 try {
		Sample.file();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}


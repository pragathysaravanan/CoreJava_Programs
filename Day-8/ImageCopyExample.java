package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample {

	public static void main(String[] args) throws IOException {
	FileInputStream fi = new FileInputStream("D:\\Java.png");
	FileOutputStream fo = new FileOutputStream("D:\\javaPic.png");
	int ch;
	while ((ch =  fi.read())!= -1) {
		fo.write(ch);
	}
	fi.close();
	fo.close();
	System.out.println("Image copied");
	}
	
}

package com.day6;
import java.io.FileNotFoundException;
import java.io.FileReader;

//chceked exception will tell the user to forcelly throws the exception
public class CheckedException {
 void myMethod() throws FileNotFoundException{
	 FileReader fr = new FileReader("TXT.txt");
 }
 
 void myMethod1(){
	 try {
		 myMethod();
	 }
	 catch(FileNotFoundException e) {
		 System.out.println("Error Found: " + e.getMessage());
		//
		 myMethod1();
	 }
	 
 }
 
	public static void main(String[] args) {
		CheckedException obj = new CheckedException();
		obj.myMethod1();

	}

}

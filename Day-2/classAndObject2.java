package com.day2; 

class Mobile{
	String mobileBrand;
	int mobileStroage; 

Mobile(String mobileBrand,int mobileStroage){
	this.mobileBrand = mobileBrand;
	this.mobileStroage = mobileStroage;
}
void display() {
	System.out.println("Mobile brand: " + mobileBrand );
	System.out.println("Mobile Stroage: " + mobileStroage + "GB");
	System.out.println("`````````");
}
}
public class classAndObject2 {

	public static void main(String[] args) {
		Mobile m=new Mobile("OnePlus", 256);
		m.display();
		
		Mobile n=new Mobile("Oppo", 256);
		n.display();

	}

}

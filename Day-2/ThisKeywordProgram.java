package com.day2; 

class MobileOne{
	String mobileBrand;
	int mobileStroage; 

MobileOne(String mobileBrand,int mobileStroage){
	this.mobileBrand = mobileBrand;
	this.mobileStroage = mobileStroage;
	
	this.display();
}
MobileOne(){
	this("OPPO",256);//this constructor
}
void display() {
	System.out.println("Mobile brand: " + mobileBrand );
	System.out.println("Mobile Stroage: " + mobileStroage + "GB");
	System.out.println("`````````");
}
}
public class ThisKeywordProgram {

	public static void main(String[] args) {
		MobileOne m=new MobileOne();
		MobileOne n=new MobileOne("OnePlus",256);
		//n.display();
		
	}

}
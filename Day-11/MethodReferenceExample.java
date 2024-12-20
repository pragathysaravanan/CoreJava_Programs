package com.day11;
@FunctionalInterface
interface interface1{
	void showMessage();
}

public class MethodReferenceExample {
	void myInstanceMethod() {
		System.out.println("Example for Instance method refernce");
	}
	
	static void myStaticMethod() {
		System.out.println("Examplefo Static method Reference");
	}
	
	MethodReferenceExample(){
		System.out.println("Example for constructor Method reference");
	}


	public static void main(String[] args) {
		MethodReferenceExample obj = new MethodReferenceExample();
		interface1 ref = obj :: myInstanceMethod; //Refernce to a Instance method
		ref.showMessage();
		
		ref = MethodReferenceExample :: myStaticMethod; //Refernce to a static method
		ref.showMessage();
		
		ref = MethodReferenceExample :: new; //Refernce to a Constructor
		ref.showMessage();
		
		

	}

}

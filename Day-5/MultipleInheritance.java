package com.day5;

interface One{
	int a = 10;//public static final
}
interface Two{
	int b = 20;
}
interface Three extends Two,One{
	void sum();//declaration
}
class NormalClass1 implements Three{
	public void sum() {
		System.out.println("The sum is: "+ (a+b));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Three three ;
		three = new NormalClass1();
		three.sum();

	}

}

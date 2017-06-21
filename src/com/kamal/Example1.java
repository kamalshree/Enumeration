package com.kamal;

public class Example1 {
	Fruits ft1, ft2;

	public void m1() {

		ft1 = Fruits.Apples;
		ft2 = Fruits.Mango;
		//ft3 = Fruits.Lemon;// Cannot add a new one

		if (ft1 == Fruits.Apples) {
			System.out.println("Enumeration constants are equal");
			System.out.println(Fruits.Apples);
		}

	}

	public void display() {
		for (Fruits ft : Fruits.values()) {
			System.out.println(ft);
		}
		System.out.println("It is " + Fruits.valueOf("Mango"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1 = new Example1();
		e1.m1();
		e1.display();
	}

}

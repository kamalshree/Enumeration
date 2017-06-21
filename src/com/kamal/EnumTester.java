package com.kamal;

public class EnumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Numbers.one);
		
		Numbers n1=Numbers.two;
		System.out.println(n1);
		System.out.println(n1.ordinal());
		
		switch (n1) {
		case one:
			System.out.println(Numbers.one);
			break;
		case two:
			System.out.println(Numbers.two);
			break;
		case three:
			System.out.println(Numbers.three);
			break;
		case four:
			System.out.println(Numbers.four);
			break;
		case five:
			System.out.println(Numbers.five);
			break;
		default:
			break;
		}
		
	}

}

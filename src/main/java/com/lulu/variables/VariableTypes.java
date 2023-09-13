package com.lulu.variables;

public class VariableTypes {

	public static void main(String[] args) {
		System.out.println("Variable Types");
		
		int no1;
		int no2;
		int result;
		
		no1=3;
		no2=7;
		
		result=no1+no2;
		
		System.out.println("Int Result="+result);
		
		float n1= 3.5f;
		float n2= 7.5f;
		
		float res=n1+n2;
		
		System.out.println("Float Result="+res);
		
		char s='s';
		
		System.out.println("Char result"+s);
		
		String str="Hello";
		String trs="World";
		String st=str+trs;
		System.out.println("String="+st);
		
		boolean b1=true;
		boolean b2=false;
		
		int m1=4;
		int m2=5;
		
		if(m2>m1)
			System.out.println(b1);
		else
			System.out.println(b2);
		
		byte c1=103;
		byte c2=-103;
		
		System.out.println(c1+","+c2);
		

	}

}

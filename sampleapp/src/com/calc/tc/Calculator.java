package com.calc.tc;

public class Calculator {

	public int SqureOfN(int number)
	{
		return number*number;
	}
	
	
	public int findTotalCharacter(String name)
	{
		int total=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='A')
				total++;
		}
		return total;
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.SqureOfN(10));
		System.out.println(c.findTotalCharacter("thamilvanan"));
	}
}

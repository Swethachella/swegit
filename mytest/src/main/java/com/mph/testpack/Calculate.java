package com.mph.testpack;

public class Calculate {

	public int add(int... number) {
		int result =0;
			for(int i: number)
			{
				result +=i;
			}		
		return result;
	}
	public int multiply(int... number) {
		int result =1;
			for(int i: number)
			{
				result *=i;
			}		
		return result;
	}
	public static void main(String[] args) {
		Calculate c =new Calculate();
		System.out.println(c.add(23,34,45));
		System.out.println(c.add(4545,45));
		System.out.println(c.multiply(23,89));
		System.out.println(c.add(23,999,45));
	}
	public Object sum(int x, int y) {
		int result=0;
		result=x+y;
		return result;
	}
	
	
}

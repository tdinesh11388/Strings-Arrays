package com.dn.string;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+""+s.charAt(i);
		}
		if(a.equals(s))System.out.println("palindrome");
		else System.out.println("not a palindrome");
	}

}

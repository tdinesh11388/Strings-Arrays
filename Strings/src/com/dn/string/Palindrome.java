package com.dn.string;

import java.util.Scanner;

public class Palindrome {

	public static boolean ispalindrome(String a)
	{
		char[]c=a.toCharArray();
		int i=a.length()-1;
		System.out.println(c[1]);
		System.out.println(c);
		System.out.println(i);
		int j=0;
		while(i>j)
		{
			if(c[i]!=c[j]) return false;
			i--;
			j++;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scn.nextLine();
		boolean c=ispalindrome(s);
		if(c==true)System.out.println("palindrome");
		else System.out.println("not a palindrome");
	}

}

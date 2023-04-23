package com.dn.string;

import java.util.Scanner;

public class Demo7 {

	public static String reverse(String s)
	{
		char [] c=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		String a=new String(c);
		return a;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		String rev=reverse(s);
		//System.out.println(rev);
		if(rev.equals(s))System.out.println("palindrome");
		else System.out.println("not palindrome");
		
	}

}

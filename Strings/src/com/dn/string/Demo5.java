package com.dn.string;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		String s1=s.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
			{
				count++;
			}
		}
		int a=s.length();
		System.out.println(a-count);
	}

}

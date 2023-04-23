package com.dn.string;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scn.next();
		int count=0;
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				s1=s1+""+c;
				//System.out.println(c);
			}
		}
		System.out.println(s1);
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int a=s1.length()-s2.length();
			s1=s2;
			System.out.println(c+"="+a);
		}
	}
}

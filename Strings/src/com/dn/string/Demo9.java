package com.dn.string;

import java.util.Scanner;

public class Demo9 {

	public static String changeCase(String s)
	{
		char[] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				a[i]=(char)(a[i]+32);
			}
			else if(a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		String r=new String(a);
		return r;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		String r=changeCase(s);
		System.out.println(r);
	}

}

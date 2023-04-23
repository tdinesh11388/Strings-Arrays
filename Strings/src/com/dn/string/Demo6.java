package com.dn.string;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		int count=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				int n=c-'0';
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}

}

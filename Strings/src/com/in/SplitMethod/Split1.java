package com.in.SplitMethod;

import java.util.Scanner;

public class Split1
{
	public static String reverse(String s)
	{
		char[]c=s.toCharArray();
		int i=0;int j=c.length-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scn.nextLine();
		String[]s1=s.split(" ");
		String s2="";
		for(int i=0;i<=s1.length-1;i++)
		{
			s2=s2+reverse(s1[i]);
			s2+=" ";
		}
		System.out.println(s2);
		
	}

}

package com.in.SplitMethod;

import java.util.Scanner;

public class WithOutSplitMethod
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		char[]c=s.toCharArray();
		int i=0;int j=0;
		int len=c.length;
		String s2="";
		while(j<len)
		{
			while(j<len && c[j]!=' ')
			{
				j++;
			}
			int k=j-1;
			String temp="";
			while(k>=i)
			{
				temp=temp+c[k];
				k--;
			}
			s2+=temp;
			s2+=" ";
			j++;
			i=j;
		}
		System.out.println(s2);
	}
}

package com.dn.string;

import java.util.Scanner;

public class Demo4 {

	public static boolean ispalindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		String bigpalin="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(ispalindrome(s,i,j))
				{
					String temp=s.substring(i,j+1);
					if(temp.length()>=bigpalin.length())
					{
						bigpalin=temp;
					}
				}
			}
		}
		System.out.println(bigpalin);
	}

}

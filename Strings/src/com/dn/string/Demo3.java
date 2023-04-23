package com.dn.string;

import java.util.Scanner;

public class Demo3 {

	public static boolean ispalindrome(String s, int i, int j)
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
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length()-1;j++)
			{
				if(ispalindrome(s,i,j))
				{
					System.out.println(s.substring(i,j+1));
				}
			}
		}
	}

}

package com.in.SplitMethod;

import java.util.Scanner;

public class Split2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.nextLine();
		String[]s1=s.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--)
		{
			s2+=s1[i];
			s2+=" ";
		}
		s2=s2.trim();
		System.out.println(s2);
		

	}

}

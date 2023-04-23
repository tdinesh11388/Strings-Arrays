package com.dn.string;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.next();
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s2=s.replace(c+"", "");
			int count=s.length()-s2.length();
			System.out.println(c+"="+count);
			s=s2;
		}
	}

}

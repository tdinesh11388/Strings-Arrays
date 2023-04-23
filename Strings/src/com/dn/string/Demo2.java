package com.dn.string;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name");
		String s=scn.nextLine();
		char[] c=s.toCharArray();
		for(char a:c)
		{
			System.out.println(a);
		}
		/*for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(s.charAt(i));
		}*/
		
	}

}

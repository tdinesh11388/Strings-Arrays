package com.dn.string;

import java.util.Scanner;

public class SplitMethod {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scn.nextLine();
		
		String[]c=s.split(" ");
		for(String a:c)
		{
			System.out.println(a);
		}
		
	}

}

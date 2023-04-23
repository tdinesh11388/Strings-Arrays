package com.dn.string;

import java.util.Scanner;

public class CountOfLetters
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter ");
		String s=scn.nextLine();
		String temp="";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			if(temp.indexOf(i)==-1)
			{
				temp=temp+c[i];
				count++;
			}
			temp=temp+count;
		}
		System.out.println(temp);
	}
}

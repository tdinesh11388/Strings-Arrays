package com.in.SplitMethod;

import java.util.Scanner;

public class Split4 {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name");
		String s=scn.nextLine();
		
		char[]c=s.toCharArray();
		String s2="";
		int len=c.length;
		int i=0;int j=0;
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
			temp+=c[k];
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

package com.in.SplitMethod;

public class Reverse {

	public static void main(String[] args)
	{
		String s="java is a high level lang";
		String[]s1=s.split(" ");
		String s2="";
		for(int i=s1.length-1;i>=0;i--)
		{
			s2=s2+rev(new String(s1[i]));
			s2+=" ";
		}
		s2.trim();
		System.out.println(s2);
	}
	public static String rev(String s)
	{
		char[]c=s.toCharArray();
		int i=0;int j=s.length()-1;
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
 
}

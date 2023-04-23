package com.dn.string;

public class Permutation {

	public static String swap(String s,int i,int j)
	{
		char[]c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return new String(c);
	}
	public static void permutation(String s,int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(start>=end)
			{
				System.out.println(s);
				return;
			}
			String s1=swap(s,start,i);
			permutation(s1,start+1,end);
		}
	}
	public static void main(String[] args)
	{
		String s="abcd";
		permutation(s,0,s.length()-1);
	}

}

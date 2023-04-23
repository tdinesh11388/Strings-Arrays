package com.dn.RegularExp;

public class Split {

	public static void main(String[] args)
	{
		String s1="din3b445sh3j2k";
		String[]a=s1.split("[0-9]");
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}

package com.dn.string;

public class CountRepeatingLetters {

	public static void main(String[] args)
	{
		String s="javadeveloper";
		String s1=s.replace("e", "");
		int count=s.length()-s1.length();
		System.out.println(count);
	}

}

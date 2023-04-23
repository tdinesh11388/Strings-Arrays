package com.dn.string;

public class Replace {

	public static void main(String[] args)
	{
		String s="javadeveloper";
		String s1=s.replace('a', 'e');
		System.out.println(s1);
		String s2=s.replace("developer", "programer");
		System.out.println(s2);
		String s3=s.replace('v', '4');
		System.out.println(s3);
		String s4=s.replace("a","");
		System.out.println(s4);
	}

}

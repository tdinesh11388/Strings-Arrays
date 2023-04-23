package com.dn.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace
{
	public static void main(String[] args)
	{
		String s1="java";
		String s2=s1.replaceAll("jav", "go");
		System.out.println(s2);
	}
	

}

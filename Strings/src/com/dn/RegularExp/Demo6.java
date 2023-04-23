package com.dn.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo6
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("([a-z]+)\\1+");
		Matcher m=p.matcher("banananana");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}

package com.dn.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("([a-z])([0-9])([0-9])([0-9])\\4+");
		Matcher m=p.matcher("a11b22c444b6666z9999v777777");
		while(m.find())
		{
			System.out.println(m.group());
		}
		
	}

}

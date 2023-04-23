package com.dn.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {

	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("([a-z])([0-9])\\2");
		Matcher m=p.matcher("a1ab22klm22m44");
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}

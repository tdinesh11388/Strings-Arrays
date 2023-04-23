package com.dn.RegularExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args)
	{
		//Scanner scn=new Scanner(System.in);
		//System.out.println("enter");
		//String exp=scn.nextLine();
		String exp="a1a2a2a3a4a2a2a2a5b1b2b3b4c1c1c2c2c2c3c4";
		Pattern p=Pattern.compile(".[a2]{2,4}");
		Matcher m=p.matcher(exp);
		while(m.find())
		{
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("_________________________");
		}
	}

}

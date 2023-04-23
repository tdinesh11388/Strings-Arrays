package com.dn.RegularExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmaileValidate
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter ");
		String s=scn.nextLine();
		String exp="[a-zA-Z]+[0-9]+[@]+[a-z]+[.][a-zA-Z]+";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
	}
	
}
package com.dn.RegularExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNum {

	public static boolean pair(String s)
	{
		String exp="[6-9][0-9]{9}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		return m.matches();
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Entr number");
		String s=scn.nextLine();
		boolean res=pair(s);
		if(res)System.out.println("valid number");
		else System.out.println("invalid nubmer");
	}

}

package com.in.SplitMethod;

import java.util.Stack;

public class Balanced {

	public static void main(String[] args)
	{
		String s="[{({})}]";
		System.out.println(balanced(s));
	}
	public static boolean balanced(String s)
	{
		Stack<Character>sk=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
			{
				sk.push(c);
			}
			else if(c==']'||c=='}'||c==')')
			{
				if(sk.isEmpty()) return false;
				char c1=sk.pop();
				if(!(pair(c1,c))) return false;
			}
		}
		if(sk.isEmpty())return true;
		else return false;
	}
	public static boolean pair(char ch1,char ch2)
	{
		if(ch1=='('&&ch2==')') return true;
		if(ch1=='{'&&ch2=='}')return true;
		if(ch1=='['&&ch2==']')return true;
		else return false;
	}

}

package com.in.SplitMethod;

import java.util.Scanner;
import java.util.Stack;

public class Demo1 {

	public static void main(String[] args)
	{
		int[]a= {2,5,7,3,9,1};
		System.out.println(search(a,6));
	}
	public static int search(int[]a,int e)
	{
		int f=0;int l=a.length-1;
		while(f<l)
		{
			int mid=(f+l)/2;
			if(a[mid]==e)return a[mid];
			else if(e<a[mid]) l=mid-1;
			else f=mid+1;
		}
		return -1;
	}
	
}

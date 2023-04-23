import java.util.Scanner;

public class ReverseAStringSplit {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s1=scn.nextLine();
		String []a=s1.split(" ");
		String s2="";
		for(String s:a)
		{
			s2=s2+rev(s);
			s2=s2+" ";
		}
		s2.trim();
		System.out.println(s2);
	}
	public static String rev(String s)
	{
		char[]c=s.toCharArray();
		int i=0; int j=c.length-1;
		while(i<=j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}

}

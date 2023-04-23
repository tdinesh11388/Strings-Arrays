import java.util.Scanner;

public class ReverseAStringWithOutSplit {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s1=scn.nextLine();
		char[]a=s1.toCharArray();
		String s2="";
		int i=0;int j=0;int len=a.length;
		
		while(j<len)
		{
			while(j<len && a[j]!=' ')
			{
				j++;
			}
			int k=j-1;
			String temp="";
			while(k>=i)
			{
				temp=temp+a[k];
				k--;
			}
			s2=s2+temp;
			if(j<=len)s2=s2+" ";
			j++;
			i=j;
		}
		System.out.println(s2);
	
	}

}

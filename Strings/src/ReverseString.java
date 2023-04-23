import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String s="ecSee1234";
		char[] c = s.toCharArray();
		int i=c.length/2-1;
		int j=0;
		while(j<=i)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i--;
			j++;
		}
		int x=c.length-j;
		int y=x+1;
		while(x<y)
		{
			char temp=c[x];
			c[x]=c[y];
			c[y]=temp;
			x++;
			y--;
		}
		System.out.println(c);
	}
}

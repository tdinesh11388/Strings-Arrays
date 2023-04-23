import java.util.Scanner;

public class NextPalindrome 
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		int num=scn.nextInt();
		int count=0;
		for(int i=num;i<num*2;i++)
		{
			int n=i;
			int rev=0;
			while(n>0)
			{
				rev=rev*10+n%10;
				n/=10;
			}
			if(rev==i)
			{
				++count;
				if(count==1)System.out.println(rev);
			}
		}
	}
}

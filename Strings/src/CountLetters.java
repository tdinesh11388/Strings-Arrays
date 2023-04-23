import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s1=scn.nextLine();
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int count=s1.length()-s2.length();
			
			System.out.println(c+"="+count);
			s1=s2;
		}
		
	}

}

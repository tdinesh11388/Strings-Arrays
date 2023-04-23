import java.util.Scanner;

public class Demo {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("entre");
		String s=scn.nextLine();
	
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"","");
			int count=s.length()-s1.length();
			System.out.println(c+"="+count);
			s=s1;
		}
	}

	
}

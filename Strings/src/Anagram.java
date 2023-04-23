
public class Anagram
{
	public static void main(String[] args)
	{
		String s1="listen";
		String s2="silent";
		
		String s3=sort(s1);
		String s4=sort(s2);
//		System.out.println(s3+"="+s4);
//		System.out.println(s3.equals(s4));
		if(s3.equals(s4))
		{
			System.out.println("anagram");
		}
		else {
			System.out.println("not a anagram");
		}
	}
	public static String sort(String s1)
	{
		char[]c=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return new String(c);
	}
}


public class StringTOInteger {

	public static void main(String[] args) 
	{
		String s="-432kh g";
		
		int res=convert(s);
		System.out.println(res);
	}
	public static int convert(String s)
	{
		char[] c = s.toCharArray();
		int a=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')continue;
			else if(c[i]>='A' && c[i]<='Z')continue;
			else if(c[i]==' ')continue;
			else if(c[i]=='+' || c[i]=='-') {
				continue;
			}
			else {
				int x=c[i]-'0';
				a=a*10+x;
			}
		}
		return a;
	}
}

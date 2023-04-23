import java.util.Stack;

public class ValidParinthisis 
{
	public static void main(String[] args) 
	{
		String s="()()[]";
		System.out.println(pair(s));
	}
	public static boolean pair(String s)
	{
		Stack<Character>st=new Stack<Character>();
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char ch1=c[i];
			if(ch1=='(' || ch1=='{' || ch1=='[')
			{
				st.push(c[i]);
			}
			else if(ch1==')'|| ch1=='}' || ch1==']')
			{
				if(st.isEmpty())return false;
				char ch2=st.pop();
				if(!isPair(ch1,ch2))return false;
			}
		}
		if(st.isEmpty())return true;
		else return false;
	}
	public static boolean isPair(char ch1,char ch2)
	{
		if(ch1==')' && ch2=='(')return true;
		if(ch1=='}' && ch2=='{')return true;
		if(ch1==']' && ch2=='[')return true;
		return false;
	}

}

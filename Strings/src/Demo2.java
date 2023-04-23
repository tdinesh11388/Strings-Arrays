import java.util.Scanner;
import java.util.Stack;

public class Demo2 {

	public static void main(String[] args)
	{
		int[][]a= {{1,2,3},{3,2,1},{2,1,3}};
		int[][]b= {{2,1,2},{1,2,1},{3,1,1}};
		int[][]c=matrix(a,b);
		for(int []z:c)
		{
			for(int x:z)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	public static int[][] matrix(int[][]a,int[][]b)
	{
		int len=a.length;
		int[][]c=new int[len][len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				for(int k=0;k<len;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
}

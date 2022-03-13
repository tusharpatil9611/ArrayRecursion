package ArrayRecursion;

import java.util.Arrays;

public class Q4Cw {

	public static void main(String[] args) 
	{
		int []a={56,96,12,45,36,85,19,3,5};
		loopI(a,0);
		loopPrint(a,0);
		//System.out.println(Arrays.toString(a));
	}
	private static void loopPrint(int[] a, int i)
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			loopPrint(a, i+1);
		}
	}
	private static void loopI(int[] a, int i) 
	{
		if(i<a.length)
		{
			int temp=a[i];
			int j=i;
			j=loopJ(temp,a,j);
			a[j]=temp;
		   loopI(a, i+1);
		}
	}
	private static int loopJ(int temp, int[] a, int j)
	{
		if(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			j=j-1;
		return	loopJ(temp, a,j);
		}
		
	return j;
	}
}

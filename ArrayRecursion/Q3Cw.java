package ArrayRecursion;

import java.util.Arrays;

public class Q3Cw {

	public static void main(String[] args) 
	{
		int[]a={21,45,67,31,11,43};
		loopI(a,0);
	
		System.out.println(Arrays.toString(a));
	}
	private static void loopI(int[] a, int i) 
	{
		if(i<a.length)
		{
		int min=i;
		int j=i+1;
		min=loopJ(a,min,i,j);
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
			loopI(a, i+1);
		}
	}
	private static int loopJ(int[] a, int min, int i, int j) 
	{
		if(j<a.length)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
			return loopJ(a, min, i, j+1);
		}
		return min;
	}
}

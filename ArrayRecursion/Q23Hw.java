package ArrayRecursion;

import java.util.Arrays;

public class Q23Hw {

	public static void main(String[] args) 
	{
		int []a={1,2,3,4,5,6,7,8,9};
		int temp=a[0];
		loopI(a,0);
		
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
		loopJ(a,0);
	}
	private static void loopJ(int[] a, int i) 
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			loopJ(a, i+1);
		}
	}
	private static void loopI(int[] a, int i) 
	{
		if(i<a.length-1)
		{
			a[i]=a[i+1];
			loopI(a, i+1);
		}
	}
}

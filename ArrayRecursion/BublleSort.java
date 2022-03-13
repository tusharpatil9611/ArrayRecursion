package ArrayRecursion;

import java.util.Arrays;

public class BublleSort {

	public static void main(String[] args) 
	{
		int []b={12,3,99,15,62,96,5,65,2};
		loopI(b,0);
		loopPrint(b,0);
		//System.out.println(Arrays.toString(b));
	}

	private static void loopPrint(int[] b, int i) 
	{
		if(i<b.length)
		{
			System.out.print(b[i]+" ");
			loopPrint(b, i+1);
		}
	}

	private static void loopI(int[] b, int i) 
	{
		if(i<b.length)
		{
			loopJ(b,0);
			loopI(b, i+1);
		}
	}

	private static void loopJ(int[] b, int j) 
	{
		if(j<b.length-1)
		{
			if(b[j]>b[j+1])
			{
				int temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
			loopJ(b, j+1);
		}
	}

}

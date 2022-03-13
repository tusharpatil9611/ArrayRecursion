package ArrayRecursion;

import java.util.Arrays;

public class Q3Hw {

	public static void main(String[] args)
	{
		int []a={6,7,8,3,4};
		
		int num=8;
		int index=0;
		int count=0;
		count=loopI(a,num,count,0);
		System.out.println(count);
		int []b=new int [a.length-count];
		loopI1(num,a,index,b,0);
		System.out.println(Arrays.toString(b));
		
	}

	private static void loopI1(int num, int[] a, int index, int[] b, int i)
	{
		if(i<a.length)
		{
			if(a[i]!=num)
				b[index++]=a[i];
			loopI1(num, a, index, b, i+1);
		}
	}

	private static int loopI(int[] a, int num, int count, int i)
	{
		if(i<a.length)
		{
			if(a[i]==num)
				count++;	
			return loopI(a, num, count, i+1);
		}
		return count;
	}

}

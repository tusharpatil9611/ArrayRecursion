package ArrayRecursion;

import java.util.Arrays;

public class Q7Cw {

	public static void main(String[] args) 
	{
		int []a={1,1,2};
		int count=0;
		count=loopI(count,a,0);
		int b[]=new int [a.length-count];
		int index=0;
		loopI1(index,a,0,b);
		System.out.println(Arrays.toString(b));
		loopPrint(b,0);
	}
	private static void loopPrint(int[] b, int i) 
	{
		if(i<b.length)
		{
			loopPrintJ(b,i,0);	
			loopPrint(b, i+1);
		}
	}
	private static void loopPrintJ(int[] b, int i, int j) 
	{
		if(j<b.length)
		{
			System.out.println("("+b[i]+" "+b[j]+")");
			loopPrintJ(b, i, j+1);
		}
	}
	private static void loopI1(int index, int[] a, int i, int[] b)
	{
		if(i<a.length)
		{
			int ckt=0;
			int j=i+1;
		ckt=loopJ1(a,ckt,b,index,i,j);

			if(ckt==0)
				b[index++]=a[i];
			loopI1(index, a, i+1, b);
		}
	}
	private static int loopJ1(int[] a, int ckt, int[] b, int index, int i, int j) 
	{
		if(j<b.length)
		{
			if(a[i]==a[j])
				ckt++;
			return loopJ1(a, ckt, b, index, i, j+1);
		}
		return ckt;
	}
	private static  int loopI(int count, int[] a, int i)
	{
		if(i<a.length)
		{
			int j=i+1;
		count=loopJ(a,count,i,j);
		return	loopI(count, a, i+1);
		}
		return count;
	}
	private static int loopJ(int[] a, int count, int i, int j)
	{
		if(j < a.length)
		{
			if(a[i]==a[j])
				count++;
		return loopJ(a, count, i, j+1);
		}
		return count;
	}

}

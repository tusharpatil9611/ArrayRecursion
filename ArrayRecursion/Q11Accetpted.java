package ArrayRecursion;

import java.util.Arrays;

public class Q11Accetpted {

	public static void main(String[] args) 
	{
		int []a={2,4,5,2,7,9,1,1,2,3,4,1,2,5,3,4,8};
		int ckt=0; 
		loopI(ckt,a,0);
		
		//System.out.println(ckt);
		int []b=new int[a.length-ckt];
		int index=0;
		index=loopUnique(index,a,b,0);
		
		//System.out.println(Arrays.toString(b));
		loopPrint(index,b,0);
	}
	private static void loopPrint(int index, int[] b, int i) 
	{
		if(i<index)
		{
			System.out.print(b[i]+" ");
			loopPrint(index, b, i+1);
		}
	}
	private static int loopUnique(int index, int[] a, int[] b, int i) 
	{
		if(i<a.length)
		{
			int counter=0;
			counter=loopUniqueJ(counter,a,b,i,0);
			if(counter==0)
			{
				b[index++]=a[i];
			}
			return loopUnique(index, a, b, i+1);
		}
		return index;
	}
	private static int loopUniqueJ(int counter, int[] a, int[] b, int i, int j)
	{
		if(j<b.length)
		{
			if(a[i]==b[j])
				counter++;

			return loopUniqueJ(counter, a, b, i, j+1);
		}
		return counter;
	}
	private static void loopI(int ckt, int[] a, int i) 
	{
		if(i<a.length)
		{
			int j=i+1;
			loopJ(a,i,ckt,j);
			loopI(ckt, a, i+1);
		}
	}
	private static void loopJ(int[] a, int i, int ckt, int j) 
	{
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				ckt++;
				return;
			}
			loopJ(a, i, ckt,j+1);
		}
	}
}

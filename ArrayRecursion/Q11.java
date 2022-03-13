package ArrayRecursion;

public class Q11 {

	public static void main(String[] args) 
	{
		int []a={22,33,44,22,33,44,55,66,44,2,1,10};
			int count=0;
			count=loopI(count,a,0);//first i loop
			
			System.out.println(count);
			int []b=new int [a.length-count];
			int index=0;
			index=loopJ(b,index,a,0);
			loopPrint(index,b,0);
	}

	private static void loopPrint(int index, int[] b, int i)
	{
		if(i<index)		// Arrays Printing Loop.
		{
			System.out.print(b[i]+" ");
			loopPrint(index, b, i+1);
		}
	}

	private static int loopJ(int[] b, int index, int[] a, int i) 
	{
		if(i<a.length)		// Loop second
		{
			int countre=0;
			countre=loopJ1(countre,0,a,index,b,i);
			if(countre==0)
				b[index++]=a[i];
				return loopJ(b, index, a, i+1);
		}return index;
	}

	private static int loopJ1(int countre, int j, int[] a, int index, int[] b, int i)
	{
		if(j<b.length)
		{
			{
				if(a[i]==a[j])
					countre++;
			}
		
			return loopJ1(countre, j+1, a, index, b, i);
		}return countre;
	}

	private static int loopI(int count, int[] a, int i)
	{
		if(i<a.length)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
					count++;
			}
			return loopI(count, a, i+1);
		}
		return count;
	}

}

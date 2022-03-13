package ArrayRecursion;

public class Q14Hw {

	public static void main(String[] args) 
	{
		int []a={3,5,7,4,3,2,1};
		loopI(a,0);
		
	}
	private static void loopI(int[] a, int i) 
	{
		if(i<a.length)
		{
			int count=0;
			int j=i+1;
		count=	loopJ(count,a,i,j);
			if(count==0)
				System.out.print(a[i]+" ");
		loopI(a, i+1);
		}
	}
	private static int loopJ(int count, int[] a, int i, int j)
	{
		if(j<a.length)
		{
			if(a[i]<a[j])
			{
				count++;
			return count;
			}
		return	loopJ(count, a, i, j+1);
		}
		return count;
	}
}

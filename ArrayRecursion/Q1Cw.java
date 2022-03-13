package ArrayRecursion;

public class Q1Cw {

	public static void main(String[] args) 
	{
		int []a={1,2,3,4};
		int sum=0;
		sum=loopI1(sum,a,0);
		System.out.println("Sum of Array "+sum);
		System.out.println("Average of an Arrays "+(sum*1.0/a.length));
	}

	private static int loopI1(int sum,int[] a, int i)
	{
		if(i<a.length)
		{
			sum=sum+a[i];	
			return loopI1(sum, a, i+1);
		}
		return sum;
	}
}

package ArrayRecursion;

public class Q25Hw {

	public static void main(String[] args) 
	{
		int a[]={3,7,90,20,5,50,40};
		int k=3;
		double min=Integer.MAX_VALUE;
		min=loopI(k,min,0,a);
		System.out.println(min);
	}
	private static double loopI(int k, double min, int i, int[] a)
	{
		if(i<a.length-k+1)
		{
			int sum=0;
			int j=i;
			sum =loopJ(a,k,i,sum,j);
			double avg=((double)sum/k);
			//System.out.println(avg);
			if(avg<min)
			{
				min=avg;
			}
			return loopI(k, min, i+1, a);
		}
		return min;
	}
	private static int loopJ(int[] a, int k, int i, int sum, int j) 
	{
		if(j<i+k)
		{
			sum=sum+a[j];
			return loopJ(a, k, i, sum, j+1);
		}
		return sum;
	}

}

package Arrays;

public class Addition {
	public static void main(String []args)
	{
		int[] a={1,2,3,4};
		int sum=0;
		sum=loopI(a,0,sum);
		System.out.println(sum);
	}

	private static int loopI(int[] a, int i, int sum) 
	{
		if(i<a.length)
		{
			sum=sum+a[i];	
			i++;
			return loopI(a, i, sum);
		}
		
		return sum;
	}

}

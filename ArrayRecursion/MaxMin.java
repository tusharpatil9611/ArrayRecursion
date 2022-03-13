package ArrayRecursion;

public class MaxMin {

	public static void main(String[] args)
	{
		int []a={14,87,95,26,36,14,86,22,2223,7879};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int []b=new int[2];
		b=loopI(a,b,max,min,0);
		max=b[0];
		min=b[1];
		
		System.out.println("Addition is "+(max+min));
	}

	private static int[] loopI(int[] a, int[] b, int max, int min, int i)
	{
		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			b[0]=max;
			b[1]=min;
			return loopI(a, b, max, min, i+1);
		}
		return b;
	}

}

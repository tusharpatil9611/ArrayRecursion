package ArrayRecursion;

public class Q12Cw {

	public static void main(String[] args) 
	{
		int []a={45,89,258,22,357,55,512,5,8,3,545,12};
		int count=0;
		count=loopI(a,count,0);
		int[] evenArray =new int[count];
		int []oddArray=new int[a.length-count];
		int evenCount=0;
		int oddCount=0;
		loopEvenOdd(a,evenArray,evenCount,oddArray,oddCount,0);
		System.out.println("Even No");
		loopEvenArray(evenArray,0);
		System.out.println();
		System.out.println("Odd Array");
		loopOddArray(oddArray,0);
	}
	private static void loopOddArray(int[] oddArray, int i) 
	{
		if(i<oddArray.length)
		{
			System.out.print(oddArray[i]+" ");
			loopOddArray(oddArray, i+1);
		}
	}
	private static void loopEvenArray(int[] evenArray, int i)
	{
		if(i<evenArray.length)
		{
			System.out.print(evenArray[i]+" ");
			loopEvenArray(evenArray, i+1);
		}
	}
	private static void loopEvenOdd(int[] a, int[] evenArray, int evenCount,
			int[] oddArray, int oddCount, int i) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				evenArray[evenCount++]=a[i];
			else
				oddArray[oddCount++]=a[i];
			loopEvenOdd(a, evenArray, evenCount, oddArray, oddCount, i+1);
		}
	}
	private static int loopI(int[] a, int count, int i) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				count++;
			return loopI(a, count, i+1);
		}
		return count;
		
	}

}

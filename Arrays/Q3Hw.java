package Arrays;
		// Write a program to remove a specific element from an array.
import java.util.*;
public class Q3Hw {

	public static void main(String[] args) 
	{
		int []a={65,66,74,3,56,23,98};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int count=0;
		
		count=loopI(0,a,num,count);
		int []b=new int [(a.length)-(count)];
		int index=0;
		loopI2(0,a,num,index,b);
		System.out.println(Arrays.toString(b));
	}

	private static void loopI2(int i, int[] a, int num, int index, int[] b) 
	{
		if(i < a.length)
		{
			if(a[i]!=num)
			{
				b[index++]=a[i];
			}
			i++;
			loopI2(i, a, num, index, b);
		}
	}

	private static int loopI(int i, int[] a, int num, int count) 
	{
		if(i < a.length)
		{
			if(a[i]==num)
			{
			 count++;
			}
			i++;
			return loopI(i, a, num, count);
		}
		return count;
	}
	
}

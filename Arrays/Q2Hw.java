package Arrays;
import java.util.*;
public class Q2Hw {
	
	public static void main(String [] arg)
	{
		int a[]={12,58,63,45,89,22,12,42};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		int count=0;
		count=loopI(0,a,count,num);
		if(count==0)
			System.out.println("not fount");
		else
			System.out.println("Found");
	}

	private static int loopI(int i, int[] a, int count, int num) 
	{
		if(i<a.length)
		{
			if(a[i]==num)
				count++;
			i++;
			 return loopI(i, a, count, num);
		}
		return count;
	}

}

package Arrays;

import java.util.Scanner;

public class Q1Hw {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no");
	int num=sc.nextInt();
	int index=-1;
		int a[]={1,2,3,4,5,67,7,8};
		index=loopI(0,a,index,num);
		if(index==-1)
			System.out.println("Not found ");
		else
			System.out.println("Found "+index);
	}

	private static int loopI(int i, int[] a, int index, int num)
	{
		if(i<a.length)
		{
			if(a[i]==num)
				index=i;
			 i++;
			return loopI(i, a, index, num);
		}
		return index;
	}

	
}

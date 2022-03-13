package ArrayRecursion;
import java.util.Scanner;
public class Q2Cw {
	public static void main(String[] args) 
	{
		int a[]={12,14,16,18,20,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int num=sc.nextInt();
		int start=0;
		int end=a.length-1;
		loopI(a,start,end,0,num);
	}

	private static void loopI(int[] a, int start, int end, int i, int num) 
	{
		if(i<a.length)
		{
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("No is found "+mid);
				return;
			}
			else if(a[mid]<num)
			{
			start=mid+1;
			}
			else if(a[mid]>num)
			{
				end=mid-1;
			}
			if(end<start)
			{
				System.out.println("Not");
				return;
			}
			loopI(a, start, end, mid+1, num);
		
		}
	}

}

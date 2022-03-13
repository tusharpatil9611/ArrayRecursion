package ArrayRecursion;

public class Q19Cw {

	public static void main(String[] args) 
	{
		int [][]a={{1,2,3,4},
					{7,6,5,4},
					{7,8,9,1},
					{4,5,6,7}};
		int sum=0;
		int count=0;
		int []b=new int[2];
		int temp1=0;
		int temp2=0;
		b=loopI(a,0,sum,count,temp1,temp2,b);	
		temp1=b[0];
		temp2=b[1];
		System.out.println(temp1);
		
		System.out.println("Average "+(temp1)/temp2);
	}
	private static int[] loopI(int[][] a, int i, int sum, int count, int temp1, int temp2, int[] b) 
	{
		if(i<a.length)
		{
			b=loopJ(a,sum,i,0,count,temp1,temp2,b);
			temp1=temp1+b[0];
			temp2=temp2+b[1];
			
			return loopI(a, i+1,sum, count, temp1, temp2,b);
		}
		b[0]=temp1;
		b[1]=temp2;
		return b;
	}
	private static int[] loopJ(int[][] a, int sum, int i, int j,int count, int temp1, int temp2, int[] b)
	{
		if(j<a[i].length)
		{
			if(i==0 || j==0 || i==a.length-1|| j==a[i].length-1)
			{}
			else
			{
				sum=sum+a[i][j];
				count++;
			}	
			return loopJ(a, sum, i, j+1, count, temp1, temp2,b);
		}
		b[0]=sum;
		b[1]=count;
		return b;
	}

}

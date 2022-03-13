package ArrayRecursion;

public class Q20Hw {

	public static void main(String[] args) 
	{
		int [][]a={{1,2,3},
				   {4,5,6},
				   {4,5,6}};
		int [][]b={{4,5,6},
				   {1,2,3},
				   {4,5,6}};
		int [][]c=new int [a.length][a[0].length];
		loopI(c,a,b,0);
		loopPrintI(c,0);
	}

	private static void loopPrintI(int[][] c, int i) 
	{
		if(i<c.length)
		{
			loopPrintJ(c,i,0);
		
			System.out.println();
			loopPrintI(c, i+1);
		}
	}

	private static void loopPrintJ(int[][] c, int i, int j)
	{
		if(j<c.length)
		{
			System.out.print(c[i][j]+" ");
		}
		loopPrintJ(c, i, j+1);
	}

	private static void loopI(int[][] c, int[][] a, int[][] b, int i)
	{
		if(i<a.length)
		{
			loopJ(c,a,b,i,0);
			loopI(c, a, b, i+1);
		}
	}

	private static void loopJ(int[][] c, int[][] a, int[][] b, int i, int j)
	{
		if(j<c.length)
		{
			c[i][j]=a[i][j]+b[i][j];
			loopJ(c, a, b, i, j+1);
		}
	}

}

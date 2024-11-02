
public class recursion2 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,3,2,1};
		System.out.println(exe20( a ));
	}
	
	public static int exe14 (int [] a , int i)
	{
		
		if (i < 0)
		{
			return 0;
		}
		
		return a[i] + exe14(a,i-1);
	}
	
	public static int exe15 (int [] a , int i)
	{
		if (i < 0)
		{
			return 0;
		}
		
		if ( a[i] <= 0)
		{
			return 0 + exe15(a, i-1);
		}
		
		return 1 + exe15(a, i-1);
	}
	
	public static int exe16 (int [] a , int n , int i)
	{
		// At first, i equals to the length - 1 of the array
		
		if (i < 0)
		{
			return -1;
		}
		
		if (a[i] == n)
		{
			return i;
		}
		
		return exe16(a, n, i-1);
	}
	
	public static boolean exe17 ( int [] a, int i)
	{
		// At first, i equals to 0
		
		if (i == a.length-1)
		{
			return true;
		}
		
		int num = a[i];
		int nextnum = a[i+1];
		
		if (num < nextnum)
		{
			return exe17(a, i+1);
		}
		
		return false;
	}
	
	public static boolean exe18 (int [] a , int i)
	{
		if ((i == a.length -1))
		{
			if (exe18_f(a[i], a[i]-1) == true)
			{
				return false;
			}
			return true;
		}
		if (exe18_f(a[i], a[i]-1) == true)
		{
			return false;
		}
		return exe18(a, i+1);
	}
	public static boolean exe18_f (int n, int m)
	{
		if (m <= 1)
		{
			return true;
		}
		else if (n % m == 0)
		{
			return false;
		}
		return exe18_f (n, m-1);
	}

	
	public static int exe19 (int [][] a, int n, int i)
	{
		return exe19_f (a, n, i, 0);
	}
	public static int exe19_f (int [][] a, int n, int i, int j)
	{
		if (i < 0)
		{
			return 0;
		}
		if (j > a[i].length-1)
		{
			return exe19_f(a, n , i-1, 0) ;
		}
		if (a[i][j] == n)
		{
			return 1 + exe19_f(a , n , i-1, 0);
		}
		return exe19_f(a , n, i, j+1);
	}
	
	
	public static boolean exe20(int [] a)
	{
		int x = (int) (Math.random()*(a.length-1));
		int y = (int) (Math.random()*(a.length-1));
		System.out.println(x + ", " + y);
		if (x > y)
		{
			return exe20_f(a,y, x);
		}
		return exe20_f(a,x,y);
	}
	public static boolean exe20_f (int [] a, int x, int y)
	{
		
		if (x >= y)
		{
			return true;
		}
		
		if (a[x] == a[y])
		{
			return exe20_f(a, x+1, y-1);
		}
		return false;
	}

}

/*

****
*   *
****
*   *
****

*/

class B
{
	public static void main(String args[])
	{
		int n=5, mid=(n/2)+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((i==1 && j<=n-1) || (i==mid && j<=n-1) || j==1 || (j==n && i%2==0) || (i==n && j<=n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
/*

   *
  **
 * *
*  *
   *
   *
*******

*/

class One
{
	public static void main(String args[])
	{
		int n=7, mid=(n/2)+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n || j==mid || (j==mid-i+1 && j<=mid))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}

/*

*       *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
*       *

*/

class X
{
	public static void main(String args[])
	{
		int n=9, mid=(n/2)+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || j==n-i+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}	
}
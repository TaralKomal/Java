/*

* * * * *
*       *
*       *
*       *
* * * * *
          *
            *
              *
                *

*/

class Q
{
	public static void main(String args[])
	{
		int n=9, mid=(n/2)+1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if((j==1 && i<=mid) || (j==mid && i<=mid) || (i==1 && j<=mid) || (i==mid && j<=mid) || (j>=mid && i==j))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}	
}
/*

55555
4444
333
22
1

*/
class Pat3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
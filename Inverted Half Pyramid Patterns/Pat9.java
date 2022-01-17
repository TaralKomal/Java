/*

ABCDE
BCDE
CDE
DE
E

*/

class Pat9
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A'; i<=n; i++)
		{
			for(char j=i; j<=n; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
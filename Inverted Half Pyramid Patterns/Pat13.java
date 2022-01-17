/*

AAAAA
BBBB
CCC
DD
E

*/

class Pat13
{
	public static void main(String args[])
	{
		char n='E';
		for(char i='A'; i<=n; i++)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
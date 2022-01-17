/*

EDCBA
DCBA
CBA
BA
A

*/

class Pat10
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n; i>='A'; i--)
		{
			for(char j=i; j>='A'; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
/*

ABCDE
ABCD
ABC
AB
A

*/

class Pat12
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n; i>='A'; i--)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
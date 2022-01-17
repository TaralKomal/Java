/*

EEEEE
DDDD
CCC
BB
A

*/

class Pat8
{
	public static void main(String args[])
	{
		char n='E';
		for(char i=n; i>='A'; i--)
		{
			for(int j='A'; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
import java.util.Scanner;
class CheackDigit
{
	public static void main(String [] args)
	{
		System.out.print("Enter a digit : ");
		char dg = new Scanner(System.in).next().charAt(0);
		System.out.println((dg>=48&&dg<=57)?(dg+" It's a digit"):(dg+" It's not a digit"));
	}
}
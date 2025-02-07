import java.util.Scanner;
class UpperLowerDigitChar
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		char ch = sc.next().charAt(0);
		String op=(ch>='A'&&ch<='A'||ch>='a'&&ch<='z')?((ch>='a'&&ch<='z')?
			(ch+" its a lowercase character"):(ch+" its an uppercase character")):
			((ch>='0'&&ch<='9')?(ch+" is a Digit"):(ch+" is a special character"));
		System.out.println(op);
	}
}
import java.util.Scanner;
class LowerCase
{
	public static void main(String [] args)
	{
		char ch = new Scanner(System.in).next().charAt(0);   // A= 65,Z=90  //  a=97 ,z=122  //0=48,9=57
		System.out.println((ch>=97&&ch<='z')?("It's a lowercase character"):("Not lowercase"));
	}
}
import java.util.Scanner;
class UpperCase
{
	public static void main(String [] args)
	{
		char ch = new Scanner(System.in).next().charAt(0);   // A= 65,Z=90  //  a=97 ,z=122  //0=48,9=57
		System.out.println((ch>=65&&ch<='Z')?("It's an uppercase character"):("Not uppercase"));
	}
}
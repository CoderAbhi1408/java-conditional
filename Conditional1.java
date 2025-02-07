import java.util.Scanner;
class Conditional1
{
	public static void main(String [] args)
	{
		System.out.print("Enter the Number : ");
		int num = new Scanner(System.in).nextInt();
		String ans = num<0 ? "Negative number" : "Positive number";
		System.out.println(ans);
	}
}
import java.util.Scanner;
class CondOperExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int lar=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		int small=(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println("Largest number is : "+lar);
		System.out.println("Smallest number is : "+small);
	}
}
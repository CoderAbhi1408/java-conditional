import java.util.Scanner;
class OperatorEx1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		int ch = sc.nextInt();
		String op=(ch%2==0&&ch%5==0)?("Hi two hi five"):
			((ch%5==0)?("hi five"):
			((ch%2==0)?("Hi two"):("")));
		System.out.println(op);
	}
}
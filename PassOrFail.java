import java.util.Scanner;
class PassOrFail
{
	public static void main(String [] args)
	{
		System.out.print("Enter the marks : ");
		int marks = new Scanner(System.in).nextInt();
		final float TOTAL_MARKS = 600;
		float percentage = (marks/TOTAL_MARKS)*100;
		System.out.println(
			(percentage>75&&percentage<=100)?("Pass with grade A " +percentage):
			((percentage>60&&percentage<75)?("Pass with grade B " +percentage):
			((percentage>=35&&percentage<60)?("Pass with grade C "+percentage):("Fail"))));
	}
}
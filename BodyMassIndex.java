import java.util.Scanner;
class BodyMassIndex
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in pounds : ");
		float weight=sc.nextFloat();
		System.out.println();
		System.out.print("Enter height in inches : ");
		float height=sc.nextFloat();
		 weight=weight* 0.45359237f;
		 height=height*0.0254f;
		 float index=weight/(height*height);
		System.out.println("The body mass index is : "+index);
	}
}

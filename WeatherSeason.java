import java.util.Scanner;
class WeatherSeason
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the month : ");
		String month = sc.next().toLowerCase();
		String op = (month.equals("oct")||month.equals("nov")||month.equals("dec")||month.equals("jan"))?("Winter Season"):
			((month.equals("feb")||month.equals("mar")||month.equals("apr")||month.equals("may"))?("Summer Season"):
			((month.equals("jun")||month.equals("jul")||month.equals("aug")||month.equals("sep"))?("Mansoon Season"):("Invalid Input")));
		System.out.println(op);
	}
}
import java.util.Scanner;
class Vovels
{
	public static void main(String [] args)
	{
		System.out.print("Enter a character : ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'&&ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?
			(ch+" The given character is a vowel"):
			(ch+" The given character is consonent"));
	}
}

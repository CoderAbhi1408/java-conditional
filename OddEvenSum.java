class OddEvenSum
{
	public static void main(String [] args)
	{
		int a = 7264;
		int evensum=0;
		int oddsum=0;
		int rem = a % 10;
		int temp = (rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem);

		a = a / 10;
		rem = a % 10;
		temp = (rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem);

		a = a / 10;
		rem = a % 10;
		temp = (rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem);

		a = a / 10;
		rem = a % 10;
		temp = (rem%2==0)?(evensum=evensum+rem):(oddsum=oddsum+rem);

		System.out.println("EvenSum is : "+evensum);
		System.out.println("OddSum is :"+oddsum);
	}
}
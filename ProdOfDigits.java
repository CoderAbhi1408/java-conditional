class ProdOfDigits
{
	public static void main(String [] args)
	{
		int num = 3425;
		int rem = num%10;
		int product = 1;
		product = product * rem;
		num = num / 10;

		rem = num % 10;
		product =product * rem;
		num = num / 10;

		rem = num % 10;
		product = product * rem;
		num = num / 10;

		rem = num % 10;
		product = product * rem;

		System.out.println("Product of digits is : "+product);
	}
}
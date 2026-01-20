package numbers;

public class Strong_num {

	static int funfact(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		return n*funfact(n-1);
	}
	public static void main(String[] args) {
		
		int n=145;
		int original_num=n;
		int last_digit;
		int fact=0;
		int sum=0;
		while(n!=0)
		{
			last_digit=n%10;
			fact=funfact(last_digit);
			sum+=fact;
			n=n/10;
		}
		
		if(original_num==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong number");
		}

	}

}

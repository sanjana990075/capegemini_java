package numbers;



public class factorial {

	static int factfun(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return n*factfun(n-1);
		}
	}
	public static void main(String[] args) {
		int num=5;
		int res=factfun(num);
		System.out.println(res);

	}

}

package numbers;

public class happy {

	public static void main(String[] args) {
		int num=19;
		int n;
		int res=0;
		while(num!=0)
		{
			n=num%10;
			res=n*n+res;
			num=num/10;
		}
		if(res==1)
		{
			System.out.println("Happy Number");
		}
		else
		{
			System.out.println("Not a Happy Number");
		}
	}

}

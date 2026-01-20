package numbers;
import java.util.*;

public class sum_of_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int num=0;
		while(n>0)
		{
			num=n%10;
			n=n/10;
			sum+=num;
		}
		System.out.println(sum);
	}

}

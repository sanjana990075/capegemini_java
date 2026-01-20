package numbers;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int n=0;
		int check_no=num;
		int rev_no=0;
		while(num>0)
		{
			n=num%10;
			rev_no=rev_no*10+n;
			num=num/10;
		}
		if(check_no==rev_no)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}

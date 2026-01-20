package numbers;
import java.util.*;

public class reverse_num {

	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		int rev_no=0;
		int last_digit=0;
		while(num>0)
		{
			last_digit=num%10;
			rev_no=rev_no*10+last_digit;
			num=num/10;
		}
		System.out.println(rev_no);
	}

}

package numbers;

public class amstrong_no {

    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        int count = 0;

        // Count number of digits
        while (n != 0) {
            count++;
            n = n / 10;
        }

        int n1 = temp;

        // Calculate Armstrong sum
        while (n1 != 0) {
            int rem = n1 % 10;
            int pow = 1;

            for (int i = 1; i <= count; i++) {
                pow = pow * rem;
            }

            sum = sum + pow;
            n1 = n1 / 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

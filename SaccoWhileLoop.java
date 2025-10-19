import java.util.Scanner;

public class SaccoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int members = sc.nextInt();
        double interestRate = 0.05;
        int i = 1;

        while (i <= members) {
            System.out.print("Enter principal amount for member " + i + ": ");
            double principal = sc.nextDouble();
            System.out.print("Enter investment period in years: ");
            int years = sc.nextInt();

            double amount = principal + (principal * interestRate * years);
            System.out.println("Total investment after " + years + " years: UGX " + amount + "\n");
            i++;
        }

        sc.close();
    }
}

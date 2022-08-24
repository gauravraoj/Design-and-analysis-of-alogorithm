
/* Divide a by b . Throw exception when b==0 */
import java.util.Scanner;

public class p3_a {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        a = sc.nextInt();
        System.out.print("Enter B : ");
        b = sc.nextInt();
        try {
            if (b == 0)
                throw new ArithmeticException("Divide by Zero Error");
            int result = a / b;
            System.out.println("A/B = " + result);
        } catch (ArithmeticException e) {

            System.out.println("Raised Exception is : " + e);

        } finally {
            System.out.println("Exection Finished !!");
        }
    }

}
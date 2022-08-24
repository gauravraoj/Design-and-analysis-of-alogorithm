
/*  Customer --> Name and DOB(dd/mm/yyyy)
*   read --> <name,dd/mm/yyyy> and display --> <name,dd,mm,yyyy>
*   Use String Tokenizer --> '\' as Delimiter
*/
import java.util.*;

class Customer {
    String Name, DOB;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :: ");
        Name = sc.next();
        System.out.println("Enter your DOB(dd/mm/yyyy) :: ");
        DOB = sc.next();

    }

    void display() {
        StringTokenizer st = new StringTokenizer(DOB, "/");

        System.out.print("OUTPUT --> " + Name);
        while (st.hasMoreTokens()) {
            System.out.print("," + st.nextToken());
        }
    }
}

public class p2_b {
    public static void main(String[] args) {
        Customer cs = new Customer();
        cs.read();
        cs.display();
    }

}

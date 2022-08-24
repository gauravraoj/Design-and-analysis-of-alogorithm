import java.util.Scanner;

class Student {
    String USN, name, branch, phone;

    public void getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th USN :: ");
        USN = sc.next();
        System.out.println("Enter the Name :: ");
        name = sc.next();
        System.out.println("Enter the Phone ::  ");
        branch = sc.next();
        System.out.println("Enter the branch :: ");
        phone = sc.next();

    }

    public void display() {
        System.out.println(USN+"\t\t"+name+"\t\t"+branch+"\t\t"+phone);
    }
}

public class p1_a
{
    public static void main (String[] args)
    {
        int i , n;
        Student[] s = new Student[100] ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number of students :: ");
        n = sc.nextInt();
        for(i =0 ; i<n ; i++ )
        {
            s[i] = new Student();
            s[i].getinfo();

        }
        System.out.println("USN\t\tNAME\t\tBRANCH\t\tPHONE\t");
        System.out.println("---------------------------------------------------------------");
        for( i=0 ; i< n ; i++ )
        {
            s[i].display();
            
            
        }
    }
}
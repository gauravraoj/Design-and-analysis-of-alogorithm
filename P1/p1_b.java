import java.time.temporal.WeekFields;
import java.util.*;

class Stack {
    int top, max;
    int[] stk;

    Stack() {
        top = -1;
        max = 5;
        stk = new int[max];

    }

    public void push() {
        if (top == max - 1) {
            System.out.println("Stack Full ");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the element :: ");
            stk[++top] = sc.nextInt();

        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Empty !!");

        } else {

            System.out.println("The deleted element :: " + stk[top--]);
        }
    }

    public void display() {
        if (top == -1)
            System.out.println("Stack is Empty !!");
        else {
            int i;
            System.out.println("Stack Elements are ::");
            for (i = top; i >= 0; i--)
                System.out.println(stk[i]);
        }
    }
}

public class p1_b {
    public static void main(String args[]) {
Stack obj = new Stack();
int choice ;
Scanner sc = new Scanner(System.in);
while(true)
{
System.out.println("STACK MENU\n**********\n1.PUSH\t2.POP\t3.DISPLAY\t4.EXIT\nEnter your choice :: ");
choice = sc.nextInt();
switch(choice)
{
    case 1 : obj.push();break;
    case 2 : obj.pop();break;
    case 3 : obj.display();;break ;
    case 4 : return ;
    default : System.out.println("Invalid choice !!");


}
   }
}
    }


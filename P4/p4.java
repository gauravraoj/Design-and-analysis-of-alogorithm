/*  QuickSort & Time Complexity
 *  1. n>5000
 *  2. Random Numbers
 *  3. Read from files
 */

import java.util.*;

class QuickSort {
    int partition(int[] a, int low, int high) {
        int temp;
        int p = a[low];
        int i = low + 1;
        int j = high;
        while (low < high) {
            while (a[i] <= p && i < high)
                i++;
            while (a[j] > p)
                j--;
            if (i < j) // Swap a[i] and a[j]
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else // Swap pivot and a[j]
            {
                temp = a[low];
                a[low] = a[j];
                a[j] = temp;
                return j;

            }
        }
        return j;

    }

    void sort(int[] a, int low, int high) {
        if (low < high) {
            int pos = partition(a, low, high);
            sort(a, low, pos - 1);
            sort(a, pos + 1, high);
        }
    }
}

public class p4 {
    public static void main(String[] args) {

        int i, n;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10000];
        QuickSort obj = new QuickSort();

        System.out.print("QuickSort\n*********\n1.Read from Keyboard\n2.Random numbers\nEnter your choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the number of elements  :");
                n = sc.nextInt();
                for (i = 0; i < n; i++)
                    a[i] = sc.nextInt();

                break;
            case 2:
                System.out.print("Enter the number of elements  :");
                Random r = new Random();
                n = sc.nextInt();
                for (i = 0; i < n; i++)
                    a[i] = r.nextInt(1000);

                break;
            default:
                System.out.println("Invalid Choice !! ");
                return;

        }

        System.out.println("Before Sorting :");
        for (i = 0; i < n; i++)
            System.out.println(a[i]);

        System.out.println("The Sorted Elements are ::");
        obj.sort(a, 0, n - 1);
        for (i = 0; i < n; i++)
            System.out.println(a[i]);
    }
}
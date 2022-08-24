import java.util.Random;
import java.util.Scanner;
import java.io.File ;
class MergeSort
{
    static int max = 10000 ;
    void merge ( int [] array , int low , int mid , int high )
    { 
        int i= low ;
        int j= mid+1 ;
        int k= low ;
        int[] resarray = new int [max] ;
        while ( i<= mid && j<= high)
        {
            if(array[i]<array[j])
            {
                resarray[k++] = array[i++];
            }
            else
            {
                resarray[k++] = array[j++] ;
            }
        }
        while(i<=mid)
        resarray[k++] = array[i++] ;
        while(j<=high)
        resarray[k++] = array[j++] ;

        for ( int m= low ; m<=high ; m++)
            array[m] = resarray[m] ;
        
    }

    void mergesort ( int[] array , int low , int high)
    {
        if( low < high)
        {
            int mid = (low + high) / 2 ;
            mergesort(array , low , mid ); ;
            mergesort(array , mid + 1, high);
            merge(array , low , mid , high);
        
        }
    }
}
public class Program5 
{
    public static void main ( String[] args )
    {
        int i,n=0;
        Scanner in = new Scanner (System.in) ;
        MergeSort obj = new MergeSort() ;
        int[] a = new int [10000] ;
        System.out.println("Press 1 to read numbers from the keyboard \nPress 2 to generate random numbers\nPress 3 to read input from the file\nEnter your choice :: ");
        int choice = in.nextInt() ;
        switch(choice)
        {
            case 1 : System.out.println("Enter the number of elements to be sorted :; ");
                n=  in.nextInt() ; 
                System.out.println("Enter"+n+" numbers") ;
                for(i=0;i<n;i++)
                a[i] = in.nextInt();
                break;

            case 2: System.out.println("Enter the number of elements to be sorted :: ") ;
                    n= in.nextInt();
                    Random rand = new Random();
                    for(i=0;i<n;i++)
                    a[i] = rand.nextInt(1000);
                    break;
            case 3 : File file  = new File("D:\\IV_Java\\P5\\prg5.txt");
                    i=0;
                    try
                    {

                        Scanner sc = new Scanner(file) ;
                        while( sc.hasNextInt())
                        {
                            a[i] = sc.nextInt();
                            System.out.println(a[i]);
                            i++;

                        }
                        n=i;
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
            default : System.out.println("Wrong choice ") ;
                      System.exit(0) ;
        }

        System.out.println("\nArray elements to be sorted :: ");
        for( i =0 ; i<n ; i++)
            System.out.println(a[i]+" ");
        long start = System.nanoTime();
        obj.mergesort(a, 0,n-1);
        long end = System.nanoTime();
        System.out.println("\n\nThe sorted elements are :: ");
        for(i=0;i<n;i++)
            System.out.println(a[i]+" ");
        System.out.println("\nThe time taken to sort elements by merge sorts is "+ (end-start)+ " nano seconds");

        


    }
}
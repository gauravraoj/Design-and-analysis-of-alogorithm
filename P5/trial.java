import java.io.File;
import java.util.*;
public class trial {
    public static void main(String args[]) 
    {
        File f = new File("D:\\IV_Java\\P5\\prg5.txt");
        int a[] = new int[1000];
        int i=0;
        try{           
        Scanner sc = new Scanner(f);
        while(sc.hasNextInt())
        {
            a[i] = sc.nextInt();
            System.out.println(a[i++]);

        }

    }
    catch(Exception e)
    {System.out.println(e);}
        System.out.println("Total NUmber of elements :: "+ i);
        
        
    }
}

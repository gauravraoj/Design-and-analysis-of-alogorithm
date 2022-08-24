/*
 *  MULTI-THREADING
 *  1 --> Random Number
 *  2 --> Square Number
 *  3 --> Cube Number
 */

import java.util.*;

class RandomNumber extends Thread {
    Random r = new Random();

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Number Generated is " + r.nextInt(100));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SquareNum extends Thread {
    int Num;

    SquareNum(int a) {
        Num = a;
    }

    public void run() {
        for (int i = 1; i < Num; i++)
            System.out.println("Square of " + i + " = " + i * i);

    }
}

class CubeNum extends Thread {
    int Num;

    CubeNum(int a) {
        Num = a;
    }

    public void run() {
        for (int i = 1; i < Num; i++)
            System.out.println("Cube of " + i + " = " + i * i * i);

    }
}

public class p3_b {
    public static void main(String[] args) {
        Thread t1 = new RandomNumber();
        t1.start();

        Thread t2 = new SquareNum(10);
        t2.start();

        Thread t3 = new CubeNum(10);
        t3.start();
    }

}

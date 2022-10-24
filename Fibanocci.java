package nest_worlout_1;

import java.util.Scanner;

public class Fibanocci {

    static int limit;

    static int fibano(int n)
    {
        if (n <= 1)
            return n;
        else
            return (fibano(n-1)+fibano(n-2));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the limit");
        limit = sc.nextInt();

        if (limit<=1)

            System.out.println("please enter a valid input");
        else
           {
            for (int i = 1; i <= limit; i++) {
                System.out.print(fibano(i) +" ");
            }

        }


    }
}

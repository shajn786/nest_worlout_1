package nest_worlout_1;

import java.util.*;

class Numbr
{

    static int num=0;
   static void read()
    {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
    }

    static void operation()
    {
        for(int i =1;i<=num;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
public class Pattern
{
    public static void main(String[] args) {

        System.out.println("enter the number of lines");
        Numbr.read();
        Numbr.operation();

    }
}
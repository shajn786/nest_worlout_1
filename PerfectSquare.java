package nest_worlout_1;
import java.lang.Math;
import java.util.*;


public class PerfectSquare {
  static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the intervals");
        int low = sc.nextInt();
        int high = sc.nextInt();


        int low_sqrt= (int) Math.floor(Math.sqrt(low));
        int high_sqrt = (int)  Math.floor(Math.sqrt(high));

        System.out.println("Perfect Square Number from "+low+" to  "+high);

        for(int i=low_sqrt;i<=high_sqrt;i++)
        {
            System.out.println( (int)Math.pow(i,2)+" ");
        }

    }
}

package nest_worlout_1;

import java.util.*;

public class Vowels {

    String str;

    void read()
    {
        Scanner sc  = new Scanner(System.in);
         str = sc.next().toUpperCase();
    }

    void checking()
    {
        switch(str)
        {
            case "A":

                System.out.println("letter is vowel");
                break;


            case "E":

                System.out.println("letter is vowel");
                break;


            case "I":

                System.out.println("letter is vowel");
                break;


            case "O":

                System.out.println("letter is vowel");
                break;


            case "U":

                System.out.println("letter is vowel");
                break;

            default:
                System.out.println("letter is consonant");
                break;

        }
    }

    public static void main(String[] args) {

        Vowels ob = new Vowels();
        System.out.println("enter the letter");
        ob.read();
        ob.checking();
    }
}

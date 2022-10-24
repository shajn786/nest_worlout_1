package nest_worlout_1;

import java.util.*;

public class Temperature {

    Float fahrenheit = 0f,celsius = 0f;

    void convert()
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter value (fahrenheit):");
        fahrenheit = sc.nextFloat();

        celsius = ((fahrenheit - 32)*5)/9;

        System.out.println("celsius :"+celsius+" C");

    }

    public static void main(String[] args) {

        Temperature ob = new Temperature();

        ob.convert();

    }


}

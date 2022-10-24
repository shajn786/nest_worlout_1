package nest_worlout_1;

public class Palindrome {

    String str;

    Palindrome(String str)
    {
        this.str = str;
    }

    //reverse of the string and chechking the reverse with original string
    void operation()
    {
        int length = str.length();

        String reverse ="",temp=str;

        for(int i =length-1;i>=0;i--)
        {
           reverse = reverse+str.charAt(i);
        }

       if(temp.equalsIgnoreCase(reverse))
           System.out.println("String is palindrome");
       else
           System.out.println("String is not palindrome");

    }

    public static void main(String[] args) {

        Palindrome ob = new Palindrome("malayalm");
        ob.operation();
    }
}

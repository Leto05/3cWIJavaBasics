package at.let.UpperAndLowerCase;

import java.util.Scanner;

public class UpperAndLowerCase
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        String s= scanner.nextLine();
        char [] cArray = s.toCharArray();

        String Up ="";
        String Low="";

        for (int i=0;i<cArray.length; i++ )
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                Up= Up + s.charAt(i);
            }
            else
            {
                Low = Low+ s.charAt(i);
            }
        }
        System.out.println(Up);
        System.out.println(Low);
    }
}

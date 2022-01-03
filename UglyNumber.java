import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

//Ugly Number
//In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
import java.util.*;
public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NUmber");
        int number=sc.nextInt();
        int x=0;
        while(number!=1)
        {
            if(number%5==0)
            {
                number=number/5;
            }
            else if(number%3==0)
            {
                number=number/3;
            }
            else if(number%2==0)
            {
                number=number/2;
            }
              else 
              {
                  System.out.print("number isn't Ugly");
                  x=1;
                  break;
              }
        }
        if(x==0)
        {
            System.out.print("Ugly Number\n");
            
        }

    }
}

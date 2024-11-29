package DAY_1;
import java.util.Scanner;
public class statements {
    public static void main(String[] args) 
    {
        
        //if statement = performs a blockof if its condition evaluates to be true
        System.out.println("Enter Your age");

        try (Scanner sc = new Scanner(System.in)) {
            int age=sc.nextInt();
   

            if(age>=18)
            {
                System.out.println("You are major");
            }
            else if(age>=75)
            {
                System.out.println("ok You are too old");
            }
            else {
                System.out.println("shit bro you are still a kid!!:) ");
            }
        }
    }
}

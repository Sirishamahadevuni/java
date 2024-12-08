package DAY_3;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String name="";

        while(name.isBlank())
        {
            System.out.println("Enter Your namw: ");
            name=sc.nextLine();

        }
        System.out.println("Hello " +name);
        sc.close();

    }
    
}

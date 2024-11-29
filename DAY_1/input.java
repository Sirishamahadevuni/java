package DAY_1;
import java.util.Scanner;

public class input{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name? ");
            String name=scanner.nextLine();

            

            System.out.println("how old are you ?");
            int age=scanner.nextInt();
            scanner.nextLine();
            

            System.out.println("What is your favourite food? ");
            String food=scanner.nextLine();
   

            System.out.println("Hello " +name);
            System.out.println("Great so you are " +age+"years old");
            System.out.println("you like " +food);
        }



    }

}
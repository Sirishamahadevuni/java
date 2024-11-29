package DAY_2;
import java.util.Scanner;
public class stuck {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String name="";
        while(name.isBlank()){
            System.out.println("Enter Your name");
            name=scanner.nextLine();

        }
        System.out.println("Hello " +name);
    }
    
}

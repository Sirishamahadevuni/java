package DAY_3;
import java.util.Scanner;

public class logic_not {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You are playing a game!! press q or Q to Quit");
        String response=sc.next();

        if(!response.equals("q") || !response.equals("Q"))
        {
            System.out.println("You are playing the game");

        }
        else{
            System.out.println("You are quiting the game");

        }
        sc.close();

    }
    
}

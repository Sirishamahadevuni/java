package DAY_3;
import java.util.*;

public class token_methods {
    public static void main(String[] args) {
        StringTokenizer str=new StringTokenizer("Hare krishnaa");
        StringTokenizer temp=new StringTokenizer("");

        //countTokens method

        int count=str.countTokens();
        System.out.println(count);

        System.out.println("welcome to GeekfroGeeks:"+str.hasMoreTokens());
        System.out.println("(Empty String):"+temp.hasMoreTokens());

        //nextelement method
        System.out.println("\n Traversing the String:");

        while(str.hasMoreTokens())
        {
            System.out.println(str.nextElement());

        }
        

    }
    
}

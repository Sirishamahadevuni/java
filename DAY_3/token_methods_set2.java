package DAY_3;
import java.util.*;

public class token_methods_set2 {
    public static void main(String[] args)
    {
        String mydelim=":";
        String mystr="Hello:World:java:programming";

        //Use of Constructor 2
        StringTokenizer st=new StringTokenizer(mystr,mydelim);

        //putting count of tokens and tokens
        int count=st.countTokens();
        System.out.println(count);

        //iterating to get the tokens

        // for(int i=0;i<count;i++)
        // {
        //     System.out.println("token at[+i+]:"+st.nextToken());
            
        // }
        //checks for more tokens using hasMoreTokens() METHOD
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }


    }
    
}

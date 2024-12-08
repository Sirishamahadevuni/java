package DAY_3.Strings;
//import java.io.*;
public class stringimmute {
    public static void main(String[] args)
    {
        String cricketer="sachin";

        /*cricketer.concat(" tendulkar");
        *this will print only  sachin since string is immutable 
        *But if we explicitly assign it to the reference variable, it will refer to the “Sachin Tendulkar” object
        */

        String name=cricketer.concat(" tendulkar");
        System.out.println(cricketer);
        System.out.println(name);
    }
}

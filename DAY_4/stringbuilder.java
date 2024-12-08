package DAY_4;

//import java.util.*;

public class stringbuilder {
    public static void main(String[] args)
    {
        //StringBuilder class differs from the StringBuffer class on the basis of synchronization. 
        //StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does.
        //Instances of StringBuilder are not safe for use by multiple threads.
        // If such synchronization is required then it is recommended that StringBuffer be used.

        StringBuilder name=new StringBuilder();
        name.append("sirisha");
        System.out.println("stringbuilder: " +name);
        StringBuilder college=new StringBuilder("snist");
        System.out.println(college.toString());

    }
}

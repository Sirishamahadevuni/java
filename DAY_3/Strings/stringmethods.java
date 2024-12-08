package DAY_3.Strings;

//import java.io.*;
//import java.util.*;

public class stringmethods {
    public static void main(String[] args) {
        
        //length

        String s1="atmiya loves";
        System.out.println("length; " +s1.length());

        //character at specified position

        System.out.println("character at 2rd position: " +s1.charAt(3));

        //printing substrings

        String s2="sirisha loves krishna";
        System.out.println(s2 +"\nsubstring from index 2: " +s2.substring(2));
        System.out.println("substring from index 4 to 9: " +s2.substring(4,9));

        //cancatination
        String s3=s1.concat(s2);
        System.out.println(s3 +"\nafter concatination" +s3);

        //finding the index

        System.out.println(s1.indexOf("loves"));

        //finding index from specified location
        System.out.println("first index:" +s1.indexOf("loves",5));

        System.out.println("last index" +s1.lastIndexOf(s3));

        System.out.println("checking is s1 is equal to s2: " +s1.equals(s2));

        String name="siri";
        String name_2="SIRI";
        System.out.println("checking is s1 is equal to s2: " +name.equals(name_2));

        System.out.println("checking is s1 is equal to s2: " +name.equalsIgnoreCase(name_2));

        System.out.println("before converting:" +name_2 +"\nafter converting to lowercase: "+name_2.toLowerCase());
        System.out.println("before converting:" +name +"\nafter converting to Uppercase: "+name.toUpperCase());


        //The result is a negative integer if this String object lexicographically precedes the argument string. 
        //The result is a positive integer if this String object lexicographically follows the argument string. 
        //The result is zero if the strings are equal; 
        //compareTo returns 0 exactly when the equals(Object) method would return true.
        System.out.println("comparing: "+name.compareTo(name_2));
        System.out.println("comparing :" +s1.compareTo(s2)); 

        //delete spaces from the sequencence from the end it doesnt effect in middle
        String s4=" i love you ";
        System.out.println("before:"+s4 +"\nafter trim:" +s4.trim());

        //replacing
        System.out.println("replacing:" +s1.replace("atmiya","sirisha")); 

        //checking for contains

        System.out.println("chceking if the string contains krishna:"+s2.contains("krishna"));

        char array[]=s2.toCharArray();
        System.out.println("String of s2: " +s2);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(" " +array[i]);
        }










        
    }
}

package DAY_3.String_buffer;

import java.util.StringTokenizer;

public class tokenizer {
    public static void main(String[] args)
    {
        //String tokenizer object maintains internally a current position within the string to be tokenized
        //hello geeks how are you === this will divide into tokens as hello,geeks,how,are,you
        //Syntax: StringTokenizer st1 = new StringTokenizer( "2+3-1*8/4", "+*-/");

        System.out.println("Using Constructor 1- ");

        StringTokenizer str1=new StringTokenizer("Hii everyone How are you"," ");

        //condition holds true till there is single token

        //remaining using hasMoreTokens() method

        while(str1.hasMoreTokens())
        {
            //GETTING NEXTTOKENS

            System.out.println(str1.nextToken());

        }
        //Costructor2
        System.out.println("Using Constructor 2-");

        StringTokenizer str2=new StringTokenizer("Java:CODE:String",":");

        //if tokens are present 

        while(str2.hasMoreTokens())
        {
            System.out.println(str2.nextToken());

        }

        StringTokenizer str3=new StringTokenizer("JAVA:CODE:String",":",true);

        //if tokens are present
        while(str3.hasMoreTokens())
        {
            System.out.println(str3.nextToken());
        }

    }
    
}

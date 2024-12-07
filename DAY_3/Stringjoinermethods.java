package DAY_3;

import java.util.StringJoiner;

public class Stringjoinermethods {
    public static void main(String[] args) {
        StringJoiner joinnames=new StringJoiner(",");
        System.out.println(joinnames);

        //we can set default empkty value
        joinnames.setEmptyValue("it is empty");
        System.out.println(joinnames);

        //adding values to stringjoiner
        joinnames.add("rahul");
        joinnames.add("sirisha");

        System.out.println(joinnames);

        //returns length of StringJoiner

        int length=joinnames.length();
        System.out.println(length);

        //returns stringjoiner as sring type
        String str=joinnames.toString();
        System.out.println(str);

        //now swe can apply string methods on it
        char ch=str.charAt(3);
        System.out.println(ch);

        //adding one more element
        joinnames.add("sai");
        System.out.println(joinnames);

        //returns length
        int newlength=joinnames.length();
        System.out.println(newlength);
    }
    
}

package DAY_3.String_builder;

public class conversion {
    public static void main(String[] args)
    {
        
        //FROM STRING TO STRING BUFFER AND STRINGBUILDER

        String str="Hare Krishna";

        //converting this string object to stringbuffer

        StringBuffer sbr=new StringBuffer(str);

        sbr.reverse();
        System.out.println(sbr);

        //converting string to string builder

        StringBuilder sbl=new StringBuilder(str);
        sbl.append("!!!");
        System.out.println(sbl);


    }
    
}

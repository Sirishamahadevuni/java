package DAY_3.String_builder;

public class Conversion3 {
    public static void main(String[] args)
    {
        //from stringbuffer to stringbuilder and vice versa
        StringBuffer sbr=new StringBuffer("hare krishna");
        //String str=sbr.toString();

        StringBuilder sbl =new StringBuilder(sbr);

        System.out.println(sbl);


    }
    
}

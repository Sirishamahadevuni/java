package DAY_3.String_builder;

public class conversion2 {
    public static void main(String[]args)
    {
        // Conversion from StringBuffer and String Buider to String

        StringBuffer sbr=new StringBuffer("hare Krishna");
        StringBuilder sbl=new StringBuilder("Hare RAM");

        String str=sbr.toString();
        System.out.println(str);

        String str1=sbl.toString();
        System.out.println(str1);

        sbr.append("!!!");
        System.out.println(sbr);
        System.out.println(str);

    }
    
}

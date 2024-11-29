package DAY_3.String_buffer;

public class constructorsinstringbuffer {
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer(); //allocates the empty stringbuffer with size of 16

        sb.append(" siri");
        sb.append(" athmiya");
        sb.append(" kath");
        sb.append(" likki");

        System.out.println("stringbuffer created initially by empty " +sb);


        StringBuffer greetings=new StringBuffer(" Hello!!"); //creates  a stringbuffer with specified string

        System.out.println("stringbuffer with specified string: " +greetings);

        StringBuffer size=new StringBuffer(5); //creates a stringbuffer with the specified size

        size.append("maths");
        size.append("physics");
        size.append("english");
        size.append("biology");
        size.append("science");

        System.out.println("stringbuffer with the specified size: " +size);
    }
    
}

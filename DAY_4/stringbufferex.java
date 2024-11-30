package DAY_4;

public class stringbufferex {
    public static void main(String args[])
    {
        StringBuffer sd=new StringBuffer();
        sd.append("hello");
        //insert(loc,value)
        
        sd.insert(5," siri");
        System.out.println(sd);

        //replacing

        sd.replace(0, 5, "hare");

        //deleting

        sd.delete(5, 9);

        sd.insert(5,"krishna");

        System.out.println(sd);
        System.out.println(sd.reverse());
        System.out.println(sd.capacity());

    }
    
}

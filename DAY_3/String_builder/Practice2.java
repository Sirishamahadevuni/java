package DAY_3.String_builder;

public class Practice2 {
    public static void main(String args[])
    {
        StringBuilder str=new StringBuilder("asdfghjkl");

        System.out.println(str.toString());

        StringBuilder revstr=str.reverse();

        System.out.println(revstr.toString());


        str.appendCodePoint(44);
        System.out.println(str);

        int capacity=str.capacity();
        System.out.println(str);
        System.out.println(capacity);
    }
    
}

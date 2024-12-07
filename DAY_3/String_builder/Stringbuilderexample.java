package DAY_3.String_builder;

public class Stringbuilderexample {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb.toString()); 

        sb.insert(6, "beautiful ");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
    
}

package DAY_3.String_builder;

public class practice {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        str.append("Hare");
        System.out.println(str.toString());
        str.append("Krishna");
        System.out.println(str.toString());

        StringBuilder str1=new StringBuilder("AASDFGHJKL;");
        System.err.println(str1);

        StringBuilder str2=new StringBuilder(10);

        System.out.println(str2.capacity());

        StringBuilder str3=new StringBuilder(str1.toString());
        System.out.println(str3.toString());
    }
    
}

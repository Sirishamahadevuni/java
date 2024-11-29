package DAY_3;

public class strings_indexing {
    public static void main(String[] args)
    {
        byte ascii[]={71,72,73};

        String s=new String(ascii);
        System.out.println(s);
        String p=new String(ascii,1,2);
        System.out.println(p);
    }
    
}

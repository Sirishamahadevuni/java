package DAY_3.String_builder;

class Solution {
    //method 1
    //concates to string
    public static void concat1(String s1)
    {
        s1=s1+"krishna";
    }

    //Method2
    //Concates to StringBuilder

    public static void concat2(StringBuilder s2)
    {
        s2.append("krishna");
    }

    //method 3
    //concates to stringBuffer

    public static void concat3(StringBuffer s3)
    {
        s3.append("krishna");
    }


    public static void main(String[] args)
    {
        //custom input string
        //string 1
        String s1="hare ";
        concat1(s1);
        
        //s1 not changes bcz string is immutable
        System.out.println(s1);

        StringBuilder s2=new StringBuilder("Hare ");
        concat2(s2);
        System.out.println(s2);

        StringBuffer s3=new StringBuffer("hare ");
        concat3(s3);
        System.out.println(s3);


    }
    
}

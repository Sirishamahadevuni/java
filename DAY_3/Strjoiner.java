package DAY_3;
import java.util.StringJoiner; 

public class Strjoiner {
    public static void main(String[] args)
    {
        StringJoiner joinnames=new StringJoiner(",");
        //passed comma as delimiter

        joinnames.add("hare");
        joinnames.add("krishna");
        joinnames.add("prabuji");
        System.out.println(joinnames);

        //adding prefix and suffix
        StringJoiner newnames=new StringJoiner(",","[","]");
        newnames.add("sirisha");
        newnames.add("kath");
        newnames.add("liki");
        newnames.add("athmiya");
        System.out.println(newnames);

        //merge two stringJoiner
        StringJoiner newlist=new StringJoiner(",","[","]");
        newlist.add("siri");
        newlist.add("asdf");

        //merging two stringJoiner
        StringJoiner merge=newnames.merge(newlist);
        System.out.println(merge);


    }
    
}

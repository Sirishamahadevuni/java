package DAY_5.Arrays;

public class methods {
    static int logic(int a,int b){
        int c;
        if(a>b){
            c=a+b;

        }
        else{
            c=(a+b)*5;

        }
        return c;
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int a1=90;
        int b1=80;
        int result=logic(a,b);//we can only call the static methods
        int c=logic(a1,b1);
        System.out.println(result);
        System.out.println(c);

        // methods c1=new methods();
        // int result1=c1.logic(a,b);
        // System.out.println(result1);

    }
    
}
 
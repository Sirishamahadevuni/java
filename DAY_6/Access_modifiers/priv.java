package DAY_6.Access_modifiers;

class test{
    void display()
    {
        System.out.println("this is default method");
    }
}

public class priv {
    public static void main(String[] args) {
        test t=new test();
        t.display();
        
    }

    
}

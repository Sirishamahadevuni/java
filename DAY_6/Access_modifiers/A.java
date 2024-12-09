package DAY_6.Access_modifiers;

public class A{
    protected void display()
    {
        System.out.println("this is protected class");
    }
}

class proc {
    public static void main(String[] args) {
        A a=new A();
        a.display();

        
    }
}

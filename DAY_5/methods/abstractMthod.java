package DAY_5.methods;

abstract class Animal {
    abstract void check(String name);
}

public class abstractMthod extends Animal{
    public static void main(String[] args) {
        abstractMthod obj=new abstractMthod();
        obj.check("rahul");
    }

    @Override void check(String name)

    {
        System.out.println(name);
    }
    
    
}

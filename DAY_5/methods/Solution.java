package DAY_5.methods;
class Gfg{
    public void countToys(String... toys) {
        System.out.println("You have " + toys.length + " toys!");
    }
    
}

class Solution{
    public static void main(String[] args)
    {
        Gfg obj=new Gfg();
        obj.countToys("ball","cat","dog");
    }
}
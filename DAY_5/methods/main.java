class solution{
    public void countToys(String... toys) {
        System.out.println("You have " + toys.length + " toys!");
    }
    
}

class main{
    public static void main(String[] args)
    {
        solution obj=new solution();
        obj.countToys("ball","cat","dog");
    }
}
package DAY_5.methods;

public class Example {
    private int number;
    private String name;

    public int getNo(int number){
        return number;
    }

    public String getName(String name)
    {
        return name;
    }

    public void setNumber(int number)
    {
        this.number=number;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void printDetails()
    {
        System.out.println(name);
        System.out.println(number);
    }

    public static void main(String[] args) {
        
        Example ex= new Example();
        ex.setName("siri");
        ex.setNumber(35);
        ex.printDetails();
        System.out.println(ex.getName("bhavana"));
        System.out.println(ex.getNo(78));
        ex.printDetails();
    }
}






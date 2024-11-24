package OOPS;
class Pen{
    String color;
    String type;

    public void write()
    {
        System.out.println("Writing something");
    }

    public void printcolor()
    {
        System.out.println(this.color); 

    }
}
public class oops{
    public static void main(String args[])
    {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="gel";
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="normal";

        pen1.write();
        pen1.printcolor();
        pen2.printcolor();
    }
}
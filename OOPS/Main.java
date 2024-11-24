package OOPS;
public class Main {
    public static void main(String[] args)
    {
        Student student1=new Student();
        System.out.println(student1.rno);//objects are stored in heap memory and reference are stored in stack memory
    }
}
class Student {
    int[] rno=new int[5];
    String[]name=new String[5];
    float[] marks=new float[5];

        
}

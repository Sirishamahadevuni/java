package DAY_5.methods;

public class test {
    public static int i=0;
    //constructor of claass
    test(){
        //counts the number of the objects of the class
        i++;
    }
    //method 1 :to access static members of the class and for getting total no of objects of same class  created so far
    public static int get(){
        return i;
    }
    //Method2:instance method calling object directly that is created inside another class can also be called by object
    //directly created in the same class and from another method defined in the same class and return integer value as return type as int
    public int m1(){
        //display the msg only
        System.out.println("inside the method m1 by object of  main class");

        //calling m2 method fromm1 method
        this.m2();return 1;

    }

    //method3:returns nothing
    public void m2(){
        System.out.println("in method m2 came from m1");
    }
    
}

//class 2 
//main class
class Mainclass{
    public static void main(String[] args) {
        //creating objects of above class inside the class
        test obj=new test();
        int i=obj.m1();
        //display msg only
        System.out.println("control returned after method 1: "+i);

        //call method m2()
        int no_of_objects=test.get();
        //print statement
        System.out.println("no of instance methods created till now: " +no_of_objects);
    }
}

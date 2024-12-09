package DAY_5.methods;
//class 1 helper class
public class methods1 {
    //in java methods name must be a verb and start with a lowercaseleter
    //if it is multi word firstletter of each word must be uppercase
    int sum=0;
    
    //method to add two numbers
    public int addTwoInt(int a,int b){
        sum=a+b;
        return sum;
    }
}
//class 2 helper class
class method2{
    //main driver mathod
    public static void main(String[] args) {
        //creating objects of class 1 inside main() method
        methods1 add=new methods1();
        //calling method of above class to add two integer
        int s=add.addTwoInt(1,2);

        //printing the sum of two number
        System.out.println("sum of two numbers :" +s);

    }
}

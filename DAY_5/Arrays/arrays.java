package DAY_5.Arrays;

public class arrays {
    public static void main(String[] args) {
        /*classroom of 500 students -you have to store marks of thsees 500 students
        You have to options
        1.create 500 variables
        2.use arrays--collection of similar type of data
        */
        //There are three main ways to create an array in java

        //1.Declaration and memory allocation
        int [] marks=new int[5];//array  is an object in java which stores contiguous elements,faster access 5*4=20 memory

        //2.Declaration and then memory allocation
        //int[] marks
        //marks=new int[5]
        //initialization

        marks[0]=78;
        marks[1]=89;
        marks[2]=90;
        marks[3]=99;
        marks[4]=100;
        // marks[5]=99; throws an error out of bound
        System.out.println(marks[0]);

        // 3.Declaration,memory allocation, and initialization together

        String [] subjects={"telugu","hindi","maths","science","social"};
        System.out.println(subjects[0]);


    }
    
}

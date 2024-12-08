package DAY_5.Arrays;

public class arrays_2 {
    public static void main(String[] args) {
        String [] subjects={"telugu","hindi","maths","science","social"};
        float [] marks={12.8f,34,67,89,9,90};
        System.out.println(marks[0]);
        System.out.println(subjects.length);
        System.out.println("printing the arrays from start");

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("printing array in reverse order");

        for(int i=marks.length -1;i>=0;i--)
        {
            System.out.println(marks[i]);

        }

        //displayong the array  (for-each loop)
        System.out.println("using for-each loop");
        for(float element: marks)
        {
            System.out.println(element);
        }

    }
    
}

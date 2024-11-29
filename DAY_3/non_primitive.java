package DAY_3;


public class non_primitive{
    public static void main(String[] args)
    {
        //int marks[]=new int[3]

        //by default java stores 0 

        int[] marks=new int[8];
        marks[0]=23;
        marks[1]=90;
        marks[2]=89;
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }

    }
    
}

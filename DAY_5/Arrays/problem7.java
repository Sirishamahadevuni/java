package DAY_5.Arrays;

public class problem7 {
    public static  void main(String[] args)
    {
        boolean isSorted=true;
        int[] array={2,6,4,67,34,652,13,123,44,89};
        for(int i=0;i<array.length-1;i++)
        {
            if(array[i]>=array[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }

}

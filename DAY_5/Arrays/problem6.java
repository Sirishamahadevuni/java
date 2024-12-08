package DAY_5.Arrays;
import java.util.*;

public class problem6 {
    public static void main(String[] args)
    {
        int[] array={2,6,4,67,34,652,13,123,44,89};
        int max_element=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(max_element<array[i])
            {
                max_element=array[i];
            }
        }
        System.out.println(max_element);
    }
    
}

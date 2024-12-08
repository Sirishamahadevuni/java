package DAY_5.Arrays;

public class practice1 {
    public static void main(String[] args)
    {
        //Practice problem 1
        float sum=0;
        float [] marks={45.7f,78.9f,89.0f,89.9f,90.9f};
        for(float element:marks)
        {
            sum=sum+element; 
        }
        System.out.println(sum);
    }
    
}

package DAY_5.Arrays;

public class problem3 {
    public static void main(String[] args){
        float [] marks={67.9f,90.6f,90.0f};
        float sum=0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("average marks :"+sum/marks.length);
    }
    
}

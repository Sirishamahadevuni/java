package DAY_5.Arrays;

public class problem2 {
    public static void main(String[] args) {
        float num=45.5f;
    
        float [] marks={45.7f,78.9f,89.0f,89.9f,90.9f};
        boolean isInArray=false;
        for(float element:marks)
        {
            if(num==element){
                isInArray=true;
                break;

            }
        }
        if(isInArray){
            System.out.println("The value is in present in array");
        }
        else{
            System.out.println("the element is not present");
        }
       
    }
    
}

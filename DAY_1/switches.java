package DAY_1;

public class switches 
{
    public static void main(String[] args)
    {
        //switch =statement allows A variable to be tested for equality against a list of values

        String day="Friday";

        switch(day){
            case "Sunday": System.out.println("it is sunday");
            break;
            case "Monday": System.out.println("it is Monday");
            break;
            case "Tuesday": System.out.println("it is tuesday");
            break;
            case "wednesday": System.out.println("it is wednesday");
            break;
            case "Thursday": System.out.println("it is thursday");
            break;
            case "Friday": System.out.println("it is friday");
            break;
            case "Saturday": System.out.println("it is saturday");
            break;
            default: System.out.println("enter correct day");


        }
    }
    
}

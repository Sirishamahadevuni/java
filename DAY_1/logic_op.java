package DAY_1;
import java.util.Scanner;
public class logic_op {
     
    static void main(String[] args)
    {
        // logical operators used to connect two or more expressions

        try (Scanner sc = new Scanner(System.in)) {
            int temp=sc.nextInt();

            if(temp>=20 && temp<=30) {
                System.out.println("it is warm outside ");
            }
            else{
                System.out.println("it is cold out side");
            }
        }

    }
}

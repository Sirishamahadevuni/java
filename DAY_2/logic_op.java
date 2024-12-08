package DAY_2;
import java.util.Scanner;
public class logic_op {
     

    static void main(String[] args)
    {
        // logical operators used to connect two or more expressions

        Scanner sca = new Scanner(System.in);
        int temp=sca.nextInt();

        if(temp>=20 && temp<=30) {
            System.out.println("it is warm outside ");
        }
        else{
            System.out.println("it is cold out side");
        }
        sca.close();
        

    }
}

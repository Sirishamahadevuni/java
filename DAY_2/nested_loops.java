package DAY_2;
import java.util.Scanner;
public class nested_loops {
    public static void main(String[] args){
        //nested loops

        Scanner sc=new Scanner(System.in);
        int rows;
        int columns;
        String symbol="";

        System.out.println("Enter number of rows: ");
        rows=sc.nextInt();
        
        System.out.println("Enter number of columns: ");
        columns=sc.nextInt();
        
        System.out.println("Enter number of symbol: ");
        symbol=sc.next();

        for(int i=1;i<=rows;i++)
        {
            
            for(int j=0;j<=columns;j++){
                System.out.print(symbol);
            }
            System.out.println();

        }
        sc.close();



    }

}

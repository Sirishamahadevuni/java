public class problm2 {
    public static void main(String[] args) {
        int array[]={36,45,8,9,43,67,90,31,67,89,90};
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%3==0)
            {
                count+=1;
                System.out.print(" "+ array[i]);

            }
        }
        
        System.out.println("\nthe count of numbers that devide by 3 are: " +count);
    }
    
}

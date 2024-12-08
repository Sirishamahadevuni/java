package DAY_5.Arrays;


public class problem5 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        int l=array.length;
        int n=Math.floorDiv(array.length,2);
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            //swap a[i] and a[l-1-i]
            int temp=array[i];
            array[i]=array[l-1-i];
            array[l-1-i]=temp;

        }
        for(int i=0;i<l;i++)
        {
            System.out.print(array[i]+" ");
        }
    

    }
    
}

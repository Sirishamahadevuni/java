public class counting {
    public static void main(String[] args) {
        int numbers[]={1,4,1,1,9,0,1,1,7,1,1,1};
        int count=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==1)
            {
                count+=1;
            }
        }
        System.out.println(count);
        
    }
}

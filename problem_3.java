public class problem_3 {
    public static void main(String[] args)
    {
        int list[]={1,2,3,4,9,5,78,5,95,3,2,2,45,7};
        int count=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]%3==0 && list[i]%2==0)
            {
               count+=1; 
               System.out.println(list[i]);
            }
        }
        System.out.println("count: " + count);
    }
}

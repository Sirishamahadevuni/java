package DAY_5.Arrays;

public class multidim {
    public static void main(String[] args)
    {
        
        //3d array String [][][] arr=new String[2][3][4]

        int [][] marks=new int[3][3];
        marks[0][0]=101;
        marks[0][1]=102;
        marks[0][2]=103;

        marks[1][0]=201;
        marks[1][1]=202;
        marks[1][2]=203;

        marks[2][0]=301;
        marks[2][1]=302;
        marks[2][2]=303;

        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks.length;j++)
            {
                System.out.print(" "+marks[i][j]);
            }
            System.out.println();
        }
    }
    
}

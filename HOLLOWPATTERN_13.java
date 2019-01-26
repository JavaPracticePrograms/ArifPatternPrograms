class HOLLOWPATTERN_13
{
    public static void main()
    {
        int a=1,b=9,c=1,d=9;
        for(int i=1;i<=7;i++)
        {
         
            for(int j=2;j<=a;j++)
            {
                System.out.print(" ");
            }
            a=a+2;
            System.out.print("*");
            System.out.println();
        }
        for (int i = 6; i >= 1; i--)
        {
            
            for (int j = 0; j <= b; j++)
            {
                System.out.print(" ");
            }
           
            {
                System.out.print("*");
            }
            b=b-2;
            System.out.println();
        }
        for(int i=1;i<=7;i++)
        {
         
            for(int j=2;j<=c;j++)
            {
                System.out.print(" ");
            }
            c=c+2;
            System.out.print("*");
            System.out.println();
        }
        for (int i = 6; i >= 1; i--)
        {
            
            for (int j = 0; j <= d; j++)
            {
                System.out.print(" ");
            }
           
            {
                System.out.print("*");
            }
            d=d-2;
            System.out.println();
        }
    }
    
}
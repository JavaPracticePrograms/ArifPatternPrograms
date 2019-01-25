class HOLLOWPATTERN_11
{
    public static void main()
    {
        int a=12,b=-1,c=-1;
        for(int i=1;i<=13;i++)
        {
            //PRINTX
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a--;
            if(i!=1)
            {
                System.out.print("*");
            }
            //PRINTX
            if(i>=7)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print(" ");
                }
                if(i!=7)
                {

                    System.out.print("*");
                }
                for(int k=1;k<=b;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                b=b+2;
                for(int j=1;j<=5;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                for(int m=1;m<=c;m++)
                {
                    System.out.print(" ");
                }
                c=c+2;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


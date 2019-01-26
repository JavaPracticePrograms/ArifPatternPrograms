class HOLLOWPATTERN_12
{
    public static void main()
    {
        int a=16,b=-1,c=-1,d=25;
        for(int i=1;i<=17;i++)
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
            if(i>=7 && i<=13)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print(" ");
                }
                if(i!=7)
                {

                    System.out.print("*");
                }
                if(i==13)
                {
                    System.out.print("************");
                }
                if(i!=13)
                {
                    for(int k=1;k<=b;k++)
                    {
                        System.out.print(" ");
                    }
                }
                if(i!=13)
                {
                    System.out.print("*");
                }
                b=b+2;
                for(int j=1;j<=5;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            if(i==17)
            {
                for(int l=1;l<=32;l++)
                {
                    System.out.print("*");
                }
            }
            if(i<=6)
            {
                for(int m=1;m<=c;m++)
                {
                    System.out.print(" ");
                }
                c=c+2;
                System.out.print("*");
            }
            if(i>=14)
            {
                for(int m=1;m<=d;m++)
                {
                    System.out.print(" ");
                }
                d=d+2;
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


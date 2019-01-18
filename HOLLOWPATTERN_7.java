class HOLLOWPATTERN_7
{
    public static void main()
    {
        int a=0,b=-1,c=5,d=1;
        for(int i=1;i<=7;i++)
        {
        for(int j=1;j<=a;j++)
        {
        System.out.print(" ");
        }
        a++;
        if(i!=7)
        {
        System.out.print("*");
        }
        for(int k=9;k>=b;k--)
        if(i==1)
        {
        System.out.print("*");
        }
        else
        {
        System.out.print(" ");
        }
        b=b+2;
        System.out.print("*");
        System.out.println();
        }

        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(" ");
            }
            c--;
            System.out.print("*");
            if(i!=6)
                for(int k=1;k<=d;k++)

                    System.out.print(" ");

            else
            {
                for(int l=1;l<=11;l++)
                {
                    System.out.print("*");
                }
            }
            d=d+2;
            System.out.print("*");
            System.out.println();
        }
    }
}


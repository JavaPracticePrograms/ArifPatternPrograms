class HOLLOWPATTERN_14
{
    public static void main()
    {
        int a=13,b=-1,c=13,d=-1,e=1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            
            a=a-2;
            if(i!=1)
            {
                System.out.print("*");
            }

            for(int k=1;k<=b;k++)

                System.out.print(" ");

            // {
            // for(int l=1;l<=11;l++)
            // {
            // System.out.print("*");
            // }
            // }
            b=b+4;
            System.out.print("*");
            for(int j=1;j<=c;j++)
            {
                System.out.print(" ");
            }
            for(int l=13;l>=e;l--)
            {
                System.out.print(" ");
            }
            c=c-2;
            e=e+2;
            if(i!=1)
            {
                System.out.print("*");
            }

            for(int k=1;k<=d;k++)

                System.out.print(" ");

            // {
            // for(int l=1;l<=11;l++)
            // {
            // System.out.print("*");
            // }
            // }
            d=d+4;
            System.out.print("*");
            System.out.println();

        }
    }
}
class HOLLOWPATTERN_8
{
    public static void main()
    {
        int a=8,b=-1,c=1,d=-1,e=8,f=1;
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("*");
            }
            a--;
            if(i!=1)
            {
                System.out.print("*");
            }
            for(int k=1;k<=b;k++)
            {
                System.out.print(" ");
            }
            b=b+2;
            System.out.print("*");
            for(int l=1; l<=e;l++)
            {
                System.out.print("*");
            }
            e--;
            System.out.println();
        }
        for(int i=1;i<=8;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            c++;
            {
                System.out.print("*");
            }
            for(int k=11;k>=d;k--)

            {
                System.out.print(" ");
            }
            d=d+2;
            if(i!=8)
            {
                System.out.print("*");
            }
            for(int l=1;l<=f;l++)
            {
                System.out.print("*");
            }
            f++;
            System.out.println();
        }
    }
}
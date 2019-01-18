class HOLLOWPATTERN_9
{
    public static void main()
    {
        int a=5,b=1,c=1,d=1;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a--;
            for(int k=1;k<=b;k++)
            {
                System.out.print(" *");
            }
            b++;
            System.out.println();
        }

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(" ");
            }
            c++;
            for(int k=5;k>=d;k--)
            {
                System.out.print(" *");
            }
            d++;
            System.out.println();
        }
    }
}
 
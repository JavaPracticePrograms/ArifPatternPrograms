class PATTERN_30
{
    public static void main()
    {  int a=1,b=1,c=1,d=3;

        for(int i=1; i <= 5; i++)
        {
            for(int l=1;l<=b;l++)
            {
                System.out.print("y");
            }
            for(int j = 9; j >=a; j--)
            {
                System.out.print("x");
            }
            a=a+2;

            for(int k=1; k <= b; k++) 
            {
                System.out.print("y");
            }
            b++;
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=c;j--)
            {
                System.out.print("y");
            }

            for(int k=1;k<=d;k++)
            {
                System.out.print("x");
            }
            d=d+2;
            for(int l=4;l>=c;l--)
            {
                System.out.print("y");
            }
            c++;
            System.out.println();
        }
    }
}


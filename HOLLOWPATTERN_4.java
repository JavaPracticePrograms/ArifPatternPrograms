class HOLLOWPATTERN_4
{
    public static void main()
    {
        int a=1,b=4;
        for(int i=1;i<=7;i++)
        {
            if(i!=1)
                System.out.print("*");
            for(int j=3;j<=a;j++)
            {
                System.out.print(" ");
            }
            a++;
            System.out.print("*");
            System.out.println();
        }
        for (int i = 6; i >= 1; i--)
        {
            System.out.print("*");
            for (int j = 1; j <= b; j++)
            {
                System.out.print(" ");
            }
            if(i!=1)
            {
                System.out.print("*");
            }
            b--;
            System.out.println();
        }
    }
}

// OUTPUT
// *
// **
// * *
// *  *
// *   *
// *    *
// *     *
// *    *
// *   *
// *  *
// * *
// **
// *

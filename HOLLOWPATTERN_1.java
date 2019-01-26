class HOLLOWPATTERN_1
{
    public static void main()
    {
        int b=8;
        for(int i=1;i<=9;i++)
        {
            if(i==1 || i==9)
            {
                for(int j=1;j<=9;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                {

                    for(int k=2;k<=b;k++)
                        System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
// *********
// *       *
// *       *
// *       *
// *       *
// *       *
// *       *
// *       *
// *********


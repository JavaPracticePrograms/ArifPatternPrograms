class PATTERN_16
{
    public static void main()
    {
        int a=0,b=5;
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a++;
            for(int k=1;k<=b;k++)
            {
                System.out.print("x");
            }
            b--;

            System.out.println();

        }
    }
}

// OUTPUT-
// xxxxx
// xxxx
// xxx
// xx
// x


class PATTERN_16
{
    public static void main()
    {
        int a=5,b=5;
        for(int i=1;i<=a;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
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


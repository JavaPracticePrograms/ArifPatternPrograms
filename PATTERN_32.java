class PATTERN_32
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=8;j>=a;j--)
            {
                System.out.print("y");
            }
            a=a+2;
            for(int k=5;k>=b;k--)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }
    }
}
        
class NUMBERPATTERN_13
{
    public static void main()
    {
        int a=4,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a--;
            for(int k=1;k<=b;k++)
            {
                System.out.print(k);
            }
            b++;
            System.out.println();
        }
    }
}
            
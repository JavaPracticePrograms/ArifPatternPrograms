class NUMBERPATTERN_15
{
    public static void main()
    {
        int a=1,b=4;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--)
        {
            for (int j = 1; j <= a; j++)
            {
                System.out.print(" ");
            }
            a++;
            for (int k = 1; k <= b; k++)
            {
                System.out.print(k);
            }
            b--;
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
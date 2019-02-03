class NUMBERPATTERN_25
{
    public static void main()
    {
        int i, j, k;
        for (i = 1; i <= 9; i++)
        {
            for (j = 1; j <= 9 - i; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (i = 1; i <= 8; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= 9 - i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
class NUMBERPATTERN_21
{
    public static void main()
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
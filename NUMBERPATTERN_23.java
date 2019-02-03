class NUMBERPATTERN_23
{
    public static void main()
    {
        {
            int i, j, k,a=9,b=1,d=9,e=2;
            for (i = 9; i >= 1; i--)
            {
                for (j = 1; j <= a; j++)
                {
                    System.out.print(" ");
                }
                a--;
                for (k = d; k <=9; k++)
                {
                    System.out.print(k + " ");
                }
                d--;
                System.out.println();
            }
            for (i = 7; i >= 0; i--)
            {
                for (j = 0; j <= b; j++)
                {
                    System.out.print(" ");
                }
                b++;
                for (k = e; k <= 9; k++)
                {
                    System.out.print(k + " ");
                }
                e++;
                System.out.println();
            }
        }
    }
}

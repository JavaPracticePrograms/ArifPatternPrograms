class NUMBERPATTERN_11
{
    public static void main()
    {
        int a=5,b=2;
        for(int i=1;i<=5;i++) 
        {
            for( int j=5;j>=a;j--)
            {
                System.out.print(j);
            }
            a--;
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int l=5;l>=b;l--)
            {
                System.out.print(l);
            }
            b++;
            System.out.println();
        }
    }
}
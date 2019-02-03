class NUMBERPATTERN_3
{
    public static void main()
    {
        int a=5;
        for(int i=1;i<=5;i++) 
        {
            for( int j=5;j>=a;j--)
            {
                System.out.print(j);
            }
            a--;
            System.out.println();
        }
    }
}
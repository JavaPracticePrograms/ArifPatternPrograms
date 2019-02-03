class NUMBERPATTERN_4
{
    public static void main()
    {
        int i,j,n=5;
        
        for(i=n;i>=1;i--) //refactor
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(j);
            }

            System.out.println("");
        }
    }
}

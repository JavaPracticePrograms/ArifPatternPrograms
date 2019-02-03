class NUMBERPATTERN_22
{
    public static void main()
    {
        int a=8,b=8,c=2,n=1,d=1,e=1,f=1;
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print(" " + " ");
            }
            b--;
            for(int j=8;j>=c;j--)
            {
                System.out.print(" " + " ");
            }
            c++;
            for(int k=i;k>=n;k--)
            {
                if(k!=9)
                    System.out.print(k + " ");
            }
            System.out.println();
        }
        for(int i=8;i>=1;i--)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(j + " ");
            }
            a--;
            for(int j=1;j<=d;j++)
            {
                System.out.print(" " + " ");
            }
            d++;
            for(int j=2;j<=e;j++)
            {
                System.out.print(" " + " ");
            }
            e++;
            for(int l=i;l>=f;l--)
            {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}


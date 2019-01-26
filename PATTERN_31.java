// xxxxx
// yyyxxxx
// yyyyyyxxx
// yyyyyyyyyxx
// yyyyyyyyyyyyx
// yyyyyyyyyxx
// yyyyyyxxx
// yyyxxxx
// xxxxx

class PATTERN_31
{
    public static void main()
    {
        int a=0,b=1,c=1,d=2;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("y");
            }
            a=a+3;
            for(int k=5;k>=b;k--)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();

        }
        for(int i=1;i<=4;i++)
        {
            for(int l=9;l>=c;l--)
            {
                System.out.print("y");
            }
            c=c+3;
            for(int m=1;m<=d;m++)
            {
                System.out.print("x");
            }
            d++;
            System.out.println();
        }
    }
}

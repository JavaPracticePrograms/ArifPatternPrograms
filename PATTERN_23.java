// xxxxx
// yxxxx
// yyxxx
// yyyxx
// yyyyx
// yyyxx
// yyxxx
// yxxxx
// xxxxx

class PATTERN_23
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
            a++;
            for(int k=5;k>=b;k--)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=3;j>=c;j--)
            {
                System.out.print("y");
            }
            c++;
            for(int k=1;k<=d;k++)
            {
                System.out.print("x");
            }
            d++;
            System.out.println();
        }
    }
}
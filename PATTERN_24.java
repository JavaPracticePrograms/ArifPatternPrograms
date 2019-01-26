// xxxxxxxxx
// yyxxxxxxx
// yyyyxxxxx
// yyyyyyxxx
// yyyyyyyyx
// yyyyyyxxx
// yyyyxxxxx
// yyxxxxxxx
// xxxxxxxxx

class PATTERN_24
{
    public static void main()
    { 
        int a=0,b=1,c=1,d=3;
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=a;j++)
            {
                System.out.print("y");
            }
            a=a+2;
            for(int k=9;k>=b;k--)
            {
                System.out.print("x");
            }
            b=b+2;
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=6;j>=c;j--)
            {
                System.out.print("y");
            }
            c=c+2;
            for(int k=1;k<=d;k++)
            {
                System.out.print("x");
            }
            d=d+2;
            System.out.println();
        }
    }
}

// yyyyyyyyyyyyx
// yyyyyyyyyxx
// yyyyyyxxx
// yyyxxxx
// xxxxx

class PATTERN_29
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=12;j>=a;j--)
            {
                System.out.print("y");
            }
            a=a+3;
            for(int k=1;k<=b;k++)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }
    }
}
// xxxxx
// yyyxxxx
// yyyyyyxxx
// yyyyyyyyyxx
// yyyyyyyyyyyyx

class PATTERN_28
{
    public static void main()
    {
        int a=0,b=1;
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
    }
}
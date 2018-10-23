// x
// yyxx
// yyyyxxx
// yyyyyyxxxx
// yyyyyyyyxxxxx

class PATTERN_33
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int k=2;k<=b;k++)
            {
                System.out.print("y");
            }
            b=b+2;
            for(int j=1;j<=a;j++)
            {
                System.out.print("x");
            }
            a++;
            
            System.out.println();
        }
    }
}
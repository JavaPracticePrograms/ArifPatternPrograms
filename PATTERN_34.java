// yyyyyyyyxxxxx
// yyyyyyxxxx
// yyyyxxx
// yyxx
// x
// yyxx
// yyyyxxx
// yyyyyyxxxx
// yyyyyyyyxxxxx

class PATTERN_34
{
    public static void main()
    {
        int a=1,b=1,c=2,d=2;
        for(int i=1;i<=5;i++)
        {
            for(int j=8;j>=a;j--)
            {
                System.out.print("y");
            }
            a=a+2;
            for(int k=5;k>=b;k--)
            {
                System.out.print("x");
            }
            b++;
            System.out.println();
        }
   
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=d;k++)
            {
                System.out.print("y");
            }
            d=d+2;
            for(int j=1;j<=c;j++)
            {
                System.out.print("x");
            }
            c++;
            
            System.out.println();
        }
    }
}
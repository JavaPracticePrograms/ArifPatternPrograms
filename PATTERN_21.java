// xxxxx
// yxxxx
// yyxxx
// yyyxx
// yyyyx
class PATTERN_21
{
    public static void main()
    {
        {
            int a=0,b=5;
            for(int i=1;i<=5;i++)
            {

                for(int j=1;j<=a;j++)
                {
                    System.out.print("y");
                }
                a++;
                for(int k=1;k<=b;k++)
                {
                    System.out.print("x");
                }
                b--;

                System.out.println();

        }
    }
}
}
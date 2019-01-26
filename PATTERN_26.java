// xxxxxxxxx
// yxxxxxxxy
// yyxxxxxyy
// yyyxxxyyy
// yyyyxyyyy

class PATTERN_26
{
    public static void main()
    {
        int a=1,b=0;

        for(int i=1; i <= 5; i++)
        {
            for(int l=1;l<=b;l++)
            {
                System.out.print("y");
            }
            for(int j = 9; j >=a; j--)
            {
                System.out.print("x");
            }
            a=a+2;

            for(int k=1; k <= b; k++) 
            {
                System.out.print("y");
            }
            b++;
            System.out.println();
        }
    }
}
 
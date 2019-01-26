// yyyyxyyyy
// yyyxxxyyy
// yyxxxxxyy
// yxxxxxxxy
// xxxxxxxxx

class PATTERN_27
{
    public static void main()
    {
        int a=1,b=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=a;j--)
            {
                System.out.print("y");
            }
            
            for(int k=1;k<=b;k++)
            {
                System.out.print("x");
            }
            b=b+2;
            for(int l=4;l>=a;l--)
            {
                System.out.print("y");
            }
            a++;
            System.out.println();
        }
    }
}
    
   
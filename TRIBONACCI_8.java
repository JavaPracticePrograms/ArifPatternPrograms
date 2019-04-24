class TRIBONACCI_8
{
    public static void main(int n)
    {
        int a = 0,b = 0,c = 1;
        int d = a+b+c;
        for(int i=4;i<=n;i++)
        {
            a=b;
            b=c;
            c=d;
            d=a+b+c;
            System.out.println(d);
        }
        
    }
}
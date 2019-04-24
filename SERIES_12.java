class SERIES_12
{
    public static void main(int x,int a)
    {
        double sum=0;
        for(int i=1;i<=x;i++)
        {
            double d=Math.pow(x,a);
            sum=sum+d;
        }
        System.out.println(sum);
    }
}
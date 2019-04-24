class GCDLCM_6
{
    public static void main(int a,int b)
    {
        int num,den;
        int rem=1;
        int gcd=0;
        if(a>b)
        {
            num=a;
            den=b;
        }
        else
        {
            num=b;
            den=a;
        }
        while(rem>0)
        {
            rem=num%den;
            gcd=den%rem;
            den=rem;
            num=den;
        }
        System.out.println(gcd);
    }
}
 
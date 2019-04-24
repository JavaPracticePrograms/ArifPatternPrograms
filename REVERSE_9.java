class REVERSE_9
{
    public static void main(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
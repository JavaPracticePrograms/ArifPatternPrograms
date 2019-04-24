class DIVISIBLE_7
{
    public static void main(int n,int m)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                System.out.println(i);
                if((i%2)==0)
                {
                    System.out.println("EVEN");
                }
                else
                {
                    System.out.println("ODD");
                }
            }

        }

    }
}


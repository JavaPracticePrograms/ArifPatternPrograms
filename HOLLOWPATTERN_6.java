class HOLLOWPATTERN_6
{
    public static void main()
    {
        int a=6,b=-1,c=0,d=-1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a--;
            if(i!=1)
            {
                System.out.print("*");
            }

            for(int k=1;k<=b;k++)
            {
                System.out.print(" ");
            }
            b=b+2;
            System.out.print("*");
            System.out.println();

        }

        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(" ");
            }
            c++;
            if(i!=7)
            {
                System.out.print("*");
            }
            for(int k=9;k>=d;k--)

            {
                System.out.print(" ");
            }

            d=d+2;

            System.out.print("*");
            System.out.println();
        }
    }
}

// OUTPUT
      // *
     // * *
    // *   *
   // *     *
  // *       *
 // *         *
// *           *
// *           *
 // *         *
  // *       *
   // *     *
    // *   *
     // * *
      // *

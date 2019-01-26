class HOLLOWPATTERN_3
{
    public static void main()
    {
        int a=0,b=-1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print(" ");
            }
            a++;
            if(i!=7)
            {
                System.out.print("*");
            }
            for(int k=9;k>=b;k--)
                if(i==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            b=b+2;
            System.out.print("*");
            System.out.println();
        }
    }
}

// OUTPUT
// *************
 // *         *
  // *       *
   // *     *
    // *   *
     // * *
      // *


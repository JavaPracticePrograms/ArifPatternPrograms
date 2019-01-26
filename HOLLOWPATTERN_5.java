class HOLLOWPATTERN_5
{
    public static void main()
    {
        int a=1,b=1,c=1,d=1;
        for(int i=1;i<=7;i++)
        {
            for(int j=6;j>=a;j--)
            {
                System.out.print(" ");
            }
            a++;
            if(i!=1)
            {
                System.out.print("*");
            }
            for(int k=3;k<=b;k++)
            {
                System.out.print(" ");
            }
            b++;
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int k=1;k<=d;k++)
            {
                System.out.print(" ");
            }
            d++;
            System.out.print("*");
            for(int j=4;j>=c;j--)
            {
                System.out.print(" ");
            }
            c++;
            if(i!=6)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// OUTPUT
      // *
     // **
    // * *
   // *  *
  // *   *
 // *    *
// *     *
 // *    *
  // *   *
   // *  *
    // * *
     // **
      // *

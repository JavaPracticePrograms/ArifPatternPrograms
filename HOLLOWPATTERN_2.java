class HOLLOWPATTERN_2
{
    public static void main()
    {
        int a=6,b=-1;
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
            if(i!=7)
                for(int k=1;k<=b;k++)

                    System.out.print(" ");

            else
            {
                for(int l=1;l<=11;l++)
                {
                    System.out.print("*");
                }
            }
            b=b+2;
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
// *************

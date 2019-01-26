class HOLLOWPATTERN_10
{
    public static void main()
    {
        int a=6,b=1,c=11,d=5,e=3;
        for(int i=1;i<=8;i++)
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
            if(i!=8)
                for(int k=1;k<=b;k++)

                    System.out.print(" ");

            else
            {
                for(int l=1;l<=13;l++)
                {
                    System.out.print("*");
                }
            }
            b=b+2;
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=9;i++)
        {
            if(i==1 || i==2 || i==3 || i==4)
            {
                System.out.print("*");

                for(int j=1;j<=13;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i==5)
            {
                System.out.print("*");
                System.out.print("   ");
                for(int j=1;j<=7;j++)
                {
                    System.out.print("*");
                }
                System.out.print("   ");
                System.out.print("*");
            }
            if(i==6 || i==7 || i==8)
            {
                System.out.print("*");
                System.out.print("   ");
                System.out.print("*");
                for(int j=1;j<=5;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.print("   ");
                System.out.print("*");
            }

           
            if(i==9)
            {
                for(int j=1;j<=15;j++)
                {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}


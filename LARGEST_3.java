class LARGEST_3
{
    public static void main(int num1,int num2,int num3)
    {
        int max=0;
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                max = num1;
            }
            else
            {
                max = num3;
            }
        }
        else
        {
            if(num2 > num3)
            {
                max = num2;
            }
            else
            {
                max = num3;
            }
        }
    }
}
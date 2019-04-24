class ASCORDER_4
{
    public static void main(int x,int y,int z)
    {
        if ((x<y) && (x<z))
        {
            System.out.print("Numbers in ascending order are: " +x );
            if (y<z)
                System.out.println(" "+ y + " " + z );
            else
                System.out.println(" " + z + " "+ y );
        }
        else
        if ((y<x) && (y<z))
        {
            System.out.print("Numbers in ascending order are: " +y );
            if (x<z)
                System.out.println(" "+ x + " " + z );
            else
                System.out.println(" " + z + " "+ x );
        }
        else
        if ((z<x) && (z<y))
        {
            System.out.print("Numbers in ascending order are: " +z );
            if (x<y)
                System.out.println(" "+ x + " " + y );
            else
                System.out.println(" " + y + " "+ x );
        }
    }
}
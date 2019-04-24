class DEPOSITS_5
{
    public static void main(double dep,int year)
    {
        double si=0;
        double amt=0;
        if(dep<2000 && year>=2)
        {
            si=(dep*year*5)/100;
        }
        else if(dep>=2000 || dep<6000 && year>=2)
        {
            si=(dep*year*7)/100;
        }
        else if(dep>6000 && year>=1)
        {
            si=(dep*year*8)/100;
        }
        else if(year>=5)
        {
            si=(dep*year*10)/100;
        }
        else
        {
            si=(dep*year*3)/100;
        }
        amt=amt+si;
        System.out.println(" " + amt);
    }
}
 
class DIGITLETTER_1
{
    public static void main(char ch)
    {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println("ENTERED CHAHARCTER IS LETTER");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("ENTERED CHARACTER IS DIGIT");
        }
        else
        {
            System.out.println("NOT LETTER,NOT DIGIT");
        }
    }
}
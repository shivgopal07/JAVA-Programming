class Continues
{
    public static void main(String args[]) 
	{
        for (int i = 0; i < 18; i++) 
		{
            System.out.print( " *");
            if (i % 2 == 0) 
                   continue;
            System.out.println("");
        }
    }
}

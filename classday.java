class Day
{
	void display()
	{
        System.out.println("Day");
    }
}

class Night
{

    void display()
	{
        System.out.println("Night");
    }
}
class Time
{
	
	public static void main()
	{
		Day o1 = new Day();
		Night o2=new Night();
		o1.displayD();
		o2.displayN();
	}  
    
} 

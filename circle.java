import java.util.Scanner;
class Circles
{
	int radius;
	void setRadius(int radius)
	{
		this.radius=radius;
	}
	double calArea()
	{
		return(3.14*radius*radius);
	}
}
class Circle
{
	public static void main(String[] args)
	{
		System.out.println("Enter the radius!");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		double y;
		Circles obj=new Circles();
		obj.setRadius(x);
		y=obj.calArea();
		System.out.println("The area is:" +y);
	}
}

package Lab3;
/*Write a program where your class will
overload calculatePerimeter() for
different shapes, each with different
set of parameters, and print the
values from each implementation.
*/

public class Program2 {
int l;
int w;
int c;
int perimeter;
public void calculatePerimeter(int b,int w)
{
	perimeter=(2*(l+w));
	System.out.println("the perimeter of the rectangle is-----"+perimeter);
}
public void calculatePerimeter(int b,int w,int c)
{
	perimeter=b+w+c;
	System.out.println("the perimeter-----"+perimeter);
}

	public static void main(String[] args) 
	{
		Program2 p2=new Program2();
		p2.calculatePerimeter(5,6);
		p2.calculatePerimeter(5, 5, 5);
		
		
	}

}

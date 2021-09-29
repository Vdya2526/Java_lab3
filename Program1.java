package Lab3; 

/*Write a program where you have an
interface Bank with getInterest() and
then, two classes which implement
the Bank interface and override the
getInterest() in each class.*/

interface Bank
{
	void getInterest();
}
class A implements Bank
{
	public void getInterest()
	{
		System.out.println("A display");
	}
}
class B implements Bank
{
	public void getInterest()
	{
		System.out.println("B display");
	}
}
public class Program1 {

	public static void main(String[] args) {
		A a=new A();
		a.getInterest();
	

	}

}

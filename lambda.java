package DSA;

@FunctionalInterface
interface hellme
{
	void call(int y);
}
class jp implements hellme
{

	@Override
	public void call(int y) 
	{
		System.out.println("from call "+y);
	}
}
public class lambda {

	public static void main(String args[])
	{
//		jp j=new jp();
//		j.call(98);
		hellme h=(input)->System.out.println("welcoome"+input);
		h.call(120); // new way to call a function.
	}
}

package DSA;

@FunctionalInterface 
interface add
{
	void show(); // no parameter
}
@FunctionalInterface
interface kk
{
	void hello(int x); // single parameter
}
@FunctionalInterface
interface dd
{
	void demo(int x,int y);//multiple parameter
}
// This is the example of void type functional interface method
public class lambda1
{
	public static void main(String args[])
	{
//		add ld=()->// no parameter
//		{System.out.println("from show method");
//		
//		};
//		ld.show();
//		kk k=(p)->// single parameter
//		{
//			System.out.println(p+p);
//		};
//		k.hello(15);
//		dd d=(a,b)-> // multiple parameter
//		{System.out.println(a+b);
//		};
//		d.demo(12, 90);
//		System.out.println("******************");
		
		add ld=()-> System.out.println("from show method");
		ld.show();
		kk k=(p)->System.out.println(p+p);
		k.hello(12);
		dd d=(a,b)->System.out.println(a+b);
		d.demo(23, 30);
		
		}
}
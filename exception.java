package inh;

import java.io.IOException;

// Exception Handling:

//public class except {

//	public static void main(String args[])
//	{
//		try
//		{System.out.println(90/0);
//		 int data[]= {12};
//		//System.out.println(data[2]);
//	}
//	catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException h)
//	{
//		System.out.println("from catch"+h);
//	}
//	finally
//	{
//		System.out.println("always runs");
//	}
//}
//}

//	public static void main(String args[]) throws IOException,NullPointerException,NumberFormatException
//	{
//		//System.out.println(90/0);
//		//int data[]= {12};
//		}
//	}
	
	class p12
	{
		void call()
		{
			System.out.println("from p12");
		}
	}
	class p21 extends p12
	{
		void call() //throws Exception
		{
			System.out.println("from p21");
		}
	}
	public class exception
	{
		public static void main(String args[]) throws InterruptedException 
		{
Thread.sleep(2000);
p21 p=new p21();
p.call();
	}
	}
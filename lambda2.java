package DSA;

import java.util.function.Function;

//This is the traditional way of using Functional Interface

class jk implements Function<String,Integer> // jk class implements FUnctional interface
{

	@Override
	public Integer apply(String msg) // return Integer apply is abstract method of function interface
	{
		return msg.length(); // returns the length of string passed
	}
	
}
public class lambda2 { 

	public static void main(String args[])
	{
		jk j=new jk();
		System.out.println(j.apply("java")); // calling interface method i.e returns integer
		Function<String ,String> data=(msg)->msg.toUpperCase();
		System.out.println(data.apply("hello lambda"));
		Function<String,String> mydata=(msg)->
		{
			return msg.concat("Ranchi city"); // this is with return statement same output
		};
		System.out.println(mydata.apply("hello lambda method")); // method must be called
	}
}

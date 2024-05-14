package inh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffer_reader {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number first");
		String num1=br.readLine();
		System.out.println("enter number second");
		String num2=br.readLine();
		System.out.println(num1+num2);
		int a=Integer.parseInt( num1);
		int b=Integer.parseInt(num2);
		System.out.println(a+b);
		
	}
}

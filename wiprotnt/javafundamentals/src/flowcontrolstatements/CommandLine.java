package flowcontrolstatements;

import java.util.Scanner;

public class CommandLine {
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("No Values");
		}
		else
		{
			System.out.println("The commandline Arguments are: ");
			for(String arg:args)
			{
				System.out.print(arg);
			}
		}
	}

}

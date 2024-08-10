package practice;

public class CommandLineArgument {

	public static void main(String[] args) {
    if(args.length>0) {
    	System.out.println("The command line arguments are: ");
    	for(String s :args)
    		System.out.println(s);
    }
    else
    	System.out.println("No Command Line "+"Arguments found.");
	}

}

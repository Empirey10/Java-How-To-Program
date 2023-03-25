// Fig. 6.9: Scope.java
// Scope class demonstrates field and local variable scopes.

public class Scope 
{
	// field that is accessible to all methods of this class
	private static int x = 1;
	
	// method main creates and initializes local variable x
	// and calls methods useLocalVariable and useField
	public static void main( String[] args )
	{
		int x = 5; // method's local variable x shadows field x
		
		System.out.printf( "local x in main is %d\n", x );
		
		useLocalVariable(); // useLocalVariable has local x
		useField(); // useField uses class Scope's field x
		useLocalVariable(); // useLocalVariable reinitiliazes local x
		useField(); // class Scope's field x retains its value
		
		System.out.printf( "\nlocal x in main is %d\n", x );
	} // end main
	
	// create and initialize local variabel x during each calls
	public static void useLocalVariable()
	{
		int x = 25; // initialized each time useLocalVariable is called
		
		System.out.printf(
		   "\nlocal x on entering method useLocalVariable is %d\n", x );
		++x; // moditifies this method's local variable x
		System.out.printf(
		   "local x befeore exiting method useLocalVariable is %d\n", x );
	} // end method useLocalVariable
	
	// modify class Scope's field x during each call
	public static void useField()
	{
		System.out.printf(
		   "\nfield x on entering method useField is %d\n", x );
		x *= 10; // moditifies class Scope's field x
		System.out.printf(
		   "field x before exiting method useField is %d\n", x );
	} // end method useField
} // end class Scope
// Fig. 8.16: Time3PackageTest.java
// Time3 object used in an application.
import com.deitel.jhtp.ch08.Time3; // import class Time3

public class Time3PackageTest
{
	public static void main( String[] args )
	{
		// create and initialize a Time3 object
		Time3 time = new Time3(); // invokes Time3 constructor
		
		// output string representations of the time
		System.out.print( "The initial universal time is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "The initial standard time is: " );
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
		
		// change time and output updated time
		time.setTime( 13, 27, 6 );
		System.out.print( "Universal time after setTime is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time after setTime is: " );
		System.out.println( time.toString() );
		System.out.println(); // output a blank line
		
		// attempt to set time with invalid values
		try
		{
			time.setTime( 99, 99, 99 ); // all values out of range
		} // end try
		catch ( IllegalArgumentException e )
		{
			System.out.printf( "Exception: %s\n\n", e.getMessage() );
		} // end catch
		
		// display time after attempt to set invalid values
		System.out.println( "After attempting invalid settings:" );
		System.out.print( "Universal time: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time: " );
		System.out.println( time.toString() );
	} // end main
} // end class Time3PackageTest
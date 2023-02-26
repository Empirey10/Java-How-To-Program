// Fig. 3.5: GradeBookTest2
// Create GrandeBook object and pass a String to
// its displayMessage method.
import java.util.Scanner; // program uses Scanner 

public class GradeBookTest2
{
	// main method begins program execution
	public static void main( String[] args )
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook2 myGradeBook2 = new GradeBook2();
		
		// prompt for and input curse name
		System.out.println( "Please enter the course name" );
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println(); // outputs a blank line
		
		// call my GradeBook2's displayMessage method
		// and pass nameOfCourse as an argument
		myGradeBook2.displayMessage( nameOfCourse );
	} // end main
 } // end class GradeBookTest2
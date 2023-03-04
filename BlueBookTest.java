// Fig. 4.10: BlueBookTest.java
// Create BlueBook object and invoke its determineClassAverage method.,

public class BlueBookTest
{
	public static void main( String[] args ) 
	{
		// create BlueBook object myBlueBook and
		// pass course name to constructor
		BlueBook myBlueBook = new BlueBook(
		  "CS101 Introduction to Java Programming" );
		  
		  myBlueBook.displayMessage(); // display welcome message
		  myBlueBook.determineClassAverage(); // find average of grades
	} // end main
} // end class BlueBookTest
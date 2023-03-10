// Fig. 5.10: LemonBookTest.java
// Create LemonBook object, input grades and display grade report.
 
public class LemonBookTest
{
	public static void main( String[] args )
	{
		// create LemonBook object myGradeBook and
		// pass course name to constructor
		LemonBook myLemonBook = new LemonBook(
		   "CS101 Introduction to Java Programming" );
		   
		myLemonBook.displayMessage(); // display welcome message
		myLemonBook.inputGrades(); // read grades from user
		myLemonBook.displayGradeReport(); // display report based on grades
	} // end main
} // end class LemonBookTest
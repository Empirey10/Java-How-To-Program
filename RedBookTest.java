// Fig. 4.7: RedBookTest.java
// Create RedBook object and invoke its determineClassAverage method.

public class RedBookTest
{
	public static void main( String[] args )
	{
		// create RedBook object myRedBook and
		// pass course name to constructor
		RedBook myRedBook = new RedBook(
		   "CS101 Introduction to Java Programming" );
		   
		myRedBook.displayMessage(); // display welcome message
	    myRedBook.determineClassAverage(); // find average of 10 grades 
	}
	}
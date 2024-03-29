// Fig. 7.15: GradeBookTest.java
// GradeBookTest creates a GradeBook object using an array of grades,
// then invokes method processGrades to analyze them.
public class GradeBookTest3
{
	// main method begins program execution
	public static void main( String[] args )
	{
		// array of student grades
		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		
		GradeBook myGradeBook = new GradeBook(
		   "CS101 Introduction to java Programming", gradesArray );
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	} // end main
} // end class GradeBookTest
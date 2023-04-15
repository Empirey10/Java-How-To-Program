// Fig. 8.8: Empeloyee.java
// Empeloyee class with refrences to other objects.

public class Empeloyee
{
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	// constructor to initialize name, birth date and hire date
	public Empeloyee( String first, String last, Date dateOfBirth,
	   Date dateOfHire )
	   {
		   firstName = first;
		   lastName = last;
		   birthDate = dateOfBirth;
		   hireDate = dateOfHire;
   } // end Empeloyee constructor

   // convert Empeloyee to String format
   public String toString()
   {
	   return String.format( "%s, %s  Hired: %s  Birthday: %s",
	     lastName, firstName, hireDate, birthDate );
   } // end method toString
} // end class Empeloyee

	
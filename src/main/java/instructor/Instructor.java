package instructor;

/**
   This class stores data about an instructor.
*/

public class Instructor
{
   private String lastName;     // Last name   
   private String firstName;    // First name
   private String officeNumber; // Office number

   /**
      This constructor initializes the last name,
      first name, and office number.
      @param lname The instructor's last name.
      @param fname The instructor's first name.
      @param office The office number.
   */

   public Instructor(String lname, String fname,
                     String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   /**
      The copy constructor initializes the object
      as a copy of another instructor.Instructor object.
      @param object2 The object to copy.
   */
   
   public Instructor(Instructor object2)
   {
      lastName = object2.lastName;
      firstName = object2.firstName;
      officeNumber = object2.officeNumber;
   }

   /**
      The set method sets a value for each field.
      @param lname The instructor's last name.
      @param fname The instructor's first name.
      @param office The office number.
   */
   
   public void set(String lname, String fname,
                   String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   /**
      toString method
      @return A string containing the instructor
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Last Name: " + lastName +
                   " First Name: " + firstName +
                   " Office Number: " + officeNumber;

      // Return the string.
      return str;
   }
   
   /**
      hashCode method
      @return A hash code for this object.
   */
   
   public int hashCode()
   {
      return ((lastName.hashCode() * 100) + 
              (firstName.hashCode() * 10) +
               officeNumber.hashCode());
   }
   
   /**
      equals method
      @return true if the argument object is equal to this
              object, false otherwise.
   */
   
   public boolean equals(Object obj)
   {
      // First make sure obj is an instructor.Instructor object.
      if (!(obj instanceof Instructor))
         return false;
      
      // Assign the argument to an instructor.Instructor variable.
      Instructor temp = (Instructor)obj;
      
      // If the fields are the same then the argument
      // is equal to this object.
      if (lastName.equals(temp.lastName) &&
          firstName.equals(temp.firstName) &&
          officeNumber.equals(temp.officeNumber))
         return true;
      else
         return false;
   }
}
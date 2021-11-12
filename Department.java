 import java.util.HashSet;
import java.util.Vector;

public class Department {
   private String name; // the name of school Dept of Computing and Info Science
   private String id; // short name for courses SOFE, ELEE, STAT, etc
   private Vector<Course> courseList; // all courses offered by the department
   private Vector<Student> registerList; // all students taking courses in the department.

   
   public Department(String name, String id) {
	      // also initialize the vectors
	   
	   }

   public String getName() {
	   
   }

   public String getId() {
	  
   }
   
 	
   public String toString() {
      // returns a string representation of department name, number 
      // of courses offered and number of students registered in the
      // department. Use the format:
      // ECSE: 53 courses, 460 students     
   }
}

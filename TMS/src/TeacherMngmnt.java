
import java.util.*;

public class TeacherMngmnt {

	 String T_name;
	    String T_gender;
	    String T_qualification;
	    String T_Address;
	    String T_country;
	    int T_NO_OFsubjects;
	    String T_Subjects;
		String T_classRooms;
		int T_NoHrs;
	    
		public static void main(String[] args){
			
			new TeacherMngmnt().getdetails();
			
			      
		}
		public void getdetails()
		{
			
		
	        Scanner Tdetails=new Scanner(System.in);
	        System.out.println("Welcome to teacher management system:");
	        System.out.println("Enter the name of the teacher:");
	        T_name=Tdetails.next();
	        System.out.println("Enter the gender:");
	        T_gender=Tdetails.next();
	        System.out.println("Enter the Qulaification:");
	        T_qualification=Tdetails.next();
	        T_Address=Tdetails.nextLine();
	        System.out.println("Enter the address:");
	        T_Address=Tdetails.nextLine();
	        System.out.println("Enter the Country:");
	        T_country=Tdetails.next();
	        
	        
	        System.out.println(" Name:"+ T_name);
		    System.out.println(" Gender:"+ T_gender);
		    System.out.println(" Qualification:"+ T_qualification);
		    System.out.println(" Address:"+T_Address);
		    System.out.println(" Country:"+T_country);
		    
		    
		    System.out.println("Enter the number of subjects to be teach:");
		    T_NO_OFsubjects=Tdetails.nextInt();
		    
		    T_Subjects=Tdetails.nextLine();
		    System.out.println("Enter the subjects:");
		    T_Subjects=Tdetails.nextLine();
	        System.out.println("Enter the classrooms:");
	        T_classRooms=Tdetails.nextLine();
	        System.out.println("Enter the hours per day:");
	        T_NoHrs=Tdetails.nextInt();
	        Tdetails.close();
	        
	        System.out.println(" Number of subjects:"+ T_NO_OFsubjects);
	        System.out.println(" Subjects:"+ T_Subjects);
	        System.out.println(" Number of Classrooms:"+ T_classRooms);
	        System.out.println(" Hours per day:"+ T_NoHrs);
	        
	        System.out.println(" Hours per day:"+ T_NoHrs);
		}	   
}

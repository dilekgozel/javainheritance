package javainheritance;

public class InstructorManager {
	public void addInstructor(Instructor instructor ) {
		System.out.println(instructor.id +" " +instructor.firstName+" " +instructor.Surname+" "+instructor.Email+" " + "e�itmen kaydedildi");
		
		
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName+"isimli e�itmen" +instructor.courseName+"kursunu ekledi" );
	}
	

}

package javainheritance;

public class InstructorManager {
	public void addInstructor(Instructor instructor ) {
		System.out.println(instructor.id +" " +instructor.firstName+" " +instructor.Surname+" "+instructor.Email+" " + "eðitmen kaydedildi");
		
		
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.firstName+"isimli eðitmen" +instructor.courseName+"kursunu ekledi" );
	}
	

}

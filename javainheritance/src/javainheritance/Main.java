package javainheritance;

public class Main {
	public static void main (String[] args ) {
		User user = new User();
		user.firstName="Dilek";
		user.Surname="gzl";
		user.Email="dlkgzl@gmail.com";
		user.id=1;
		UserManager userManager=new UserManager();
		userManager.addUser(user);
		userManager.deleteUser(user);
		userManager.updateUser(user);
		
		Student student = new Student();
		student.firstName="Dilek";
		student.Surname="gzl";
		student.Email="dlkgzl1@gmail.com";
		student.studentAdress="istanbul";
		student.studentCourse="java";
		student.studentSchool="erü";
		student.studentSuccessRate="100";
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		
		Instructor instructor= new Instructor();
		instructor.id=1;		
		instructor.firstName="Engin";
		instructor.Surname="Demiroğ";
		instructor.courseName="Java";
		instructor.courseNumber="4";
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addInstructor(instructor);
		
		
	}

	}



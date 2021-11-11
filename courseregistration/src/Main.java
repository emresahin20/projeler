
public class Main {

	public static void main(String[] args) {

		
		User user= new User(); 
		user.id=1001;
		user.firstName=" Emre";
		user.lastName="Şahin";
	
		UserManager userManager=new UserManager();
		userManager.logIn(user);
		userManager.singIn(user);
		userManager.singOut(user);
		
		Students students=new Students();
		students.id=2;
		students.firstName=" Emre";
		students.lastName="Şahin";
		students.lesson=" Java";
	
		StudentManager studentManager=new StudentManager();
		studentManager.lessonSelection(students);
		
		Instructor instructor=new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.branch=" Java";
		
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.branchSelection(instructor);
		
		
		
	}

}

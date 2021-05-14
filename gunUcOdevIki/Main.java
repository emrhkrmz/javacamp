package gunUcOdevIki;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1,"engin","demiroğ","engin@email.com","35***ckl");
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(2,"derin","demiroğ","derin@email.com","35***ckl");
		
		UserManager userManager = new UserManager();
		User[] users = {instructor,student};
		
		instructorManager.yoneticiOlarakGirisYapildi(instructor);
		instructorManager.odevlerEklendi(instructor);
		studentManager.add(student);
		studentManager.kursaKayitOlundu(student);
		

	}

}

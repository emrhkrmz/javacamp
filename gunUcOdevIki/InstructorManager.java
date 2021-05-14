package gunUcOdevIki;

public class InstructorManager extends UserManager {
	
	public void odevlerEklendi(Instructor instructor) {
		System.out.println(instructor.getName()+" : eğitmen : ödevleri eklendi");
	}
	
	public void yoneticiOlarakGirisYapildi(Instructor instructor) {
		System.out.println(instructor.getEmail()+" : hesabı ile yönetici olarak giriş yapıldı");
	}

}

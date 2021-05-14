package gunUcOdevIki;

public class StudentManager extends UserManager {
	
	public void add(Student student) {
		System.out.println(student.getId()+" : id : yoklamız alındı");		
	}
	
	public void kursaKayitOlundu(Student student) {
		System.out.println(student.getName()+" : kursa kayıt oldu");
	}

}

package tr.org.linux.kamp.student;

public class StudentApplication {
	public static void main(String[] args) {
	
		Student student1 = new Student("Arkadas Zekai",80);
        System.out.println(student1.getName() + " 'nin notu : " + student1.getLetterGrade());
	}
}

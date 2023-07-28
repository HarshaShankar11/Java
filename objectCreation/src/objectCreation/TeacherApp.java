package objectCreation;

public class TeacherApp {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.id=143;
		t1.name="Omkar";
		t1.subject="Anatomy";
		t1.teach();
		t1.motivate();
		t1.giveAssignment();
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.subject);
		System.out.println("==============================================");

		Teacher t2=new Teacher();
		t2.id=163;
		t2.name="Harsha Shankar";
		t2.subject="Cardiology";
		t2.teach();
		t2.motivate(); 
		t2.giveAssignment();
		System.out.println(t2.id);
		System.out.println(t2.name);
		System.out.println(t2.subject);
	}

}

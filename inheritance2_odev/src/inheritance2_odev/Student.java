package inheritance2_odev;

public class Student extends User {

	private String studentNo;
	private String mark;
	public Student() {
	
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String surname, String nationalIdentity, String birthDay) {
		super(id, name, surname, nationalIdentity, birthDay);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		
		System.out.println("Watashi wa gakuseidesu");
	}
	
}

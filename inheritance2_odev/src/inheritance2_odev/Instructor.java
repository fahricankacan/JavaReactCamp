package inheritance2_odev;

public class Instructor extends Student{

	private String courseTitle;
	private String instructorNo;
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Instructor(int id, String name, String surname, String nationalIdentity, String birthDay,
			String courseTitle, String instructorNo) {
		super(id, name, surname, nationalIdentity, birthDay);
		// TODO Auto-generated constructor stub
		this.courseTitle = courseTitle;
		this.instructorNo = instructorNo;
	}
	
	@Override
	public void whoAmI() {
		// TODO Auto-generated method stub
		
		System.out.println("Watashi wa senseidesu"
				);
	}
}

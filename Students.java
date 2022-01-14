package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		
		System.out.println("Student ID is " + id);
		}
	
	public void getStudentInfo(int id , String name) {
		
		System.out.println("Student ID is " + id + " Student name is " + name);
		}

	public void getStudentInfo(String email , int phone) {
		
		System.out.println("Student email is " + email + " Student phoneNumber is " + phone);
		}


	public static void main(String[] args) {
		Students Stu = new Students();
		Stu.getStudentInfo(100010);
		Stu.getStudentInfo(100010,"Vidya");
		Stu.getStudentInfo("vidya1012@gmail.com",12345678);

	}

}

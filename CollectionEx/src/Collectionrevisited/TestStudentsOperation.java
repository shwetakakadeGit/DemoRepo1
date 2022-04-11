package Collectionrevisited;

public class TestStudentsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prepare students
		PrepareStudent sp = new PrepareStudent();
		sp.buildStudents();
		// retrieve students
		RetriveStudents retrivestudents = new RetriveStudents();
		retrivestudents.fetchStudent();

	}

}

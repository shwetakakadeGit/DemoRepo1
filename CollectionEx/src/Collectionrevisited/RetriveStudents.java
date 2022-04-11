package Collectionrevisited;
import java.util.ArrayList;

public class RetriveStudents {
	void fetchStudent() {
		PrepareStudent prepare1= new PrepareStudent();
		ArrayList<Student> listStu = prepare1.buildStudents();
		// enhance for loop -- for each loop
		for (Student student : listStu) {
			System.out.println("students age: " + student.age);
			System.out.println("students location: " + student.Loc);
		}
	}

}

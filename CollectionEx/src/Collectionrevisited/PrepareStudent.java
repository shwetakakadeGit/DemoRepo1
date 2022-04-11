package Collectionrevisited;
import java.util.ArrayList;

public class PrepareStudent {
	public ArrayList<Student> buildStudents() {
		Student student1 = new Student();
		student1.age = 28;
		student1.Loc = "Pune11";
		Student student2 = new Student();
		student2.age = 30;
		student2.Loc = "Nagpur111";
		// Students added in arraylist
		// remember a1 knows students’ address but not age and loc
		// Here we are placing addresses not actual data in ArrayList
		ArrayList<Student> arrayListStu = new ArrayList<Student>();
		arrayListStu.add(student1);
		arrayListStu.add(student2);
		return arrayListStu;
	}
}

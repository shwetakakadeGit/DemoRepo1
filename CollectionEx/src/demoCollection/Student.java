package demoCollection;

public class Student {
	
	int roll_no;
	String Name;
	double Percentage;
	 Student(int roll_no, String Name,double Percentage){
		 this.roll_no=roll_no;
		 this.Name=Name;
		 this.Percentage=Percentage;		 
	 }
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", Name=" + Name + ", Percentage=" + Percentage + "]";
	}
	 
	 
}

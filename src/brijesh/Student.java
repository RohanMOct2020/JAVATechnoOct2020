package brijesh;

public class Student {
	String name;
	int marks;
	void studentName(String name) {
		this.name=name;
	}
	
	void gainedMark(int marks) {
		this.marks=marks;
	}
	
	void displayInfo() {
		String grade;
		if(marks>=90)
			grade="A+";
		else if(marks>=80)
			grade="A";
		else if(marks>=70)
			grade="B+";
		else if(marks>=60)
			grade="B";
		else
			grade="C";
		System.out.println("Student Name: "+name+", Grade: "+grade);
	}

	public static void main(String[] args) {
		Student student=new Student();
		student.studentName("Amar");
		student.gainedMark(90);
		student.displayInfo();
	}

}

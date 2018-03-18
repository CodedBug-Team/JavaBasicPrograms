package heap.Example2;

class Student {
	School n; // instance variable
	String Lname; // instance variable

	public static void main(String args[]) {
		Student s; // local variable:s
		s = new Student();
		s.subjects(s);
	}

	void subjects(Student stud) { // local variable: stud
		n = new School();
		stud.setName("Alice");
	}

	void setName(String studLastName) { // local variable: studName 
		Lname = studLastName;
	}
}
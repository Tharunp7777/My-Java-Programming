package Day5;

public class StudentMain {

	public static void main(String[] args) {
	
		//Student stu1=new Student();//stu1 is object reference variable
		
		//Approach1 - assigning the values using object refernce varaible
		/*stu1.sid=100;
		stu1.sname="Kiran";
		stu1.grade='A';*/
		
		//Appraoch2 - using method
		//stu1.getValues(100,"Kiran",'A');
		
		//Approach3 - constructor
		Student stu1=new Student(100,"Kiran",'A');
		stu1.display();

	}

}

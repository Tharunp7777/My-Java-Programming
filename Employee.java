package Day5;

public class Employee 
{

	//Class variables
	int eid;  
	String ename;
	int deptno;
	String job;
	
	//class methods
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	/*public static void main(String args[])
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="David";
		emp1.deptno=10;
		emp1.job="Manager";
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="John";
		emp2.deptno=20;
		emp2.job="Engineer";
		
		emp2.display();
		
		
	}*/
	
}

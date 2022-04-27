package Day5;

public class Calculation {
	
	int x=100,y=200;
	
	//case1 - not taking params , not returns output
	/*void sum()
	{
		System.out.println(x+y);
	}*/
	
	//Case2 -not taking params , returns output
	/*int sum()
	{
		return(x+y);
	}*/
	
	//case3 -taking params , not returns output
	
	/*void sum(int a, int b)
	{
	x=a;
	y=b;
	System.out.println(x+y);
	}*/
	
	
	//case4- taking params , returns output
	int sum(int a, int b)
	{
	x=a;
	y=b;
	return(x+y);
	}
	
	
	public static void main(String[] args) {
	
		Calculation cal=new Calculation();
		
		//int res=cal.sum();
		//System.out.println(cal.sum());
	
		int res=cal.sum(10, 20);
		System.out.println(res);
	}

}


public class StaticPractice {

	/* STATIC VARIABLE
	String name;
	int rollno;
	static String college="PANIMALAR"; 
	
	StaticPractice(String n,int r) {
	name=n;
	rollno=r;
	}
	public void display()
	{
		System.out.println(name+rollno+college);
	}
	
	public static void main(String args[])
	{
		StaticPractice s1=new StaticPractice("lakshmi",12345);
		s1.display();
	} */
	
	/* COUNTER INCREMENT USING STATIC
	static int count;
		 StaticPractice() {
			 count=count+1;
			System.out.println(count);
		}
	public static void main(String arrgs[]) {
		StaticPractice s1=new StaticPractice();
		StaticPractice s2=new StaticPractice();				
	}*/
	
	/* STATIC METHOD
	int rollno;
	String name;
	static String college="Panimalar";
	
	StaticPractice(int r, String n) {
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="RMK";
	}
	 void display()
	{	 
	System.out.println(rollno+name+college);
	}
	public static void main(String args[])
	{
		StaticPractice s1=new StaticPractice(12345,"laksh");
		StaticPractice.change();
		s1.display();
	}*/
	
	/*int sum = 0;
	static int calculate(int x1, int y1)
	{
		return x1+y1;
	}
	public static void main(String args[])
	{
		
		int sum=StaticPractice.calculate(10,20);
		System.out.println(sum);
	}*/
	
}

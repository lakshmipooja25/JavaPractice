
/*class Parent{
	String a ="laksh";
	void display()
	{
	System.out.println("Parent display");	
	}
}

class child extends Parent
{	
	int a=20;
	void display()
	{	
		System.out.println(super.a);
		super.display();
	}
	void display1()
	{
		System.out.println("child display");
	}
	}
 class SuperKeyword {

	public static void main(String[] args) {
	child c = new child();
	
	c.display();
	System.out.println(c.a);
	c.display1();	
	}
}*/

/*class Parent
{
	Parent()
	{
	System.out.println("Parent constructor");	
	}
}

class child extends Parent
{
	child()
	{
		//super();
		System.out.println("child constructor");
	}
	
	child(int a, int b)
	{		
		System.out.println("parameterized constructor" +a+b);
	}
}

class SuperKeyword{
	public static void main(String[] args) {
	child c = new child();
	child c1 = new child(10,20);
	
	}
}*/

class EmployeeDetails
{
	EmployeeDetails(int empno, String name)
	{
		System.out.println(empno);
		System.out.println(name);
	}
}

class EmployeeBenefits extends EmployeeDetails
{
	int salary,hra,bonus;
	EmployeeBenefits(int salary, int hra, int bonus)
	{
		super(12345, "Lakshmi");
		this.salary=salary;
		this.hra=hra;
		this.bonus=bonus;	
		
	}
	
	public void display()
	{
		System.out.println(salary+hra+bonus) ;
		//return totalsalary;
	}
}

class SuperKeyword
{
	
	public static void main(String[] args) {
		
	EmployeeBenefits b = new EmployeeBenefits(40000,1000,2000)	;
	b.display();
	
	}
}



// resolving ambiguity between instance variable and parameters
/*class Test 
{
	int x;
	int y;
	
	Test(int x, int y) {
	this.x=x;
	this.y=y;
	}
	
 void display() {
	 
	 System.out.println(x);
	 System.out.println(y);
 }
}

public class ThisKeyword {

	public static void main(String args[])
	{
		Test t = new Test(10,20);
		t.display();
	}
}*/

//INVOKE THE METHOD OF SAME CLASS WITHIN CLASS
/*class TestThis
{
	
	void display(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void display1()
	{
		this.display(10,20);
	}
	
	}

public class ThisKeyword {

	public static void main(String args[])
	{
		TestThis t = new TestThis();
		t.display1();
	}
}*/

//CALLING CONSTRUCTOR USING THIS
/*
class A
{
	String name;
	String subject;
	int ph_no;
	int marks;
	
	A(String name, int ph_no, String subject)
	{
		
		this.name=name;
		this.subject=subject;
		this.ph_no=ph_no;
	}
	
	A(String name, int ph_no, String subject,int marks)
	{
		this( name,  ph_no,  subject);
		this.marks=200;
	}

	void display()
	{
		System.out.println(name+" "+ph_no+" "+subject+" "+marks);
	}
}

public class ThisKeyword {

	public static void main(String args[])
	{
		A t = new A("laksh",12345,"physics");
		A t1 = new A("puppy",98765,"English");
		t.display();
		t1.display();
	}
}*/

/*class A
{
	void method1(A obj)
	{
		System.out.println("passing this inside parameter");
	}
void method()
{
	method1(this);
	}

}
public class ThisKeyword {

	public static void main(String args[])
	{
		A t = new A();
		t.method();
		
	}
}*/

/*class A
{
A(B obj)
{
System.out.println("this constructor call");	
}

void methodA()
{
	System.out.println("calling method A");
	}
}
class B
{
	B()
	{}
	A a = new A(this);
	void methodB()
	{
		System.out.println("calling method B");
	}
	
	}
public class ThisKeyword {

	public static void main(String args[])
	{
		B t = new B();
		t.methodB();
	}
}*/

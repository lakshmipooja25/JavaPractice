
abstract class parent
{
	parent()
	{
		System.out.println("abstract parent constructor");
	}
	abstract int displayabstract(int c, int d);
	
	void nonabstract()
	{
		System.out.println("display non abstract method");
	}
	static void method_static()
	{
		System.out.println("calling static method");
	}
	final void method_final()
	{
		System.out.println("calling final method");
	}
}


 class AbstractPractice extends parent
 {
	 int c;
	  AbstractPractice() {
		  
	System.out.println("child abstract constructor");
	}
	 int displayabstract(int a, int b)
	 {
		 this.c=c;
		 c=a+b;
		 return c;
	 }
	 
	 
public static void main(String args[])
{
	parent p = new AbstractPractice();
	
	System.out.println(p.displayabstract(5,10));
	
	p.nonabstract();
	
	parent.method_static();
	p.method_final();
	}
}

/*interface A {
	void method1();
	
}

abstract class B implements A
{
	void method1()
	{
		System.out.println("method1 display");
	}
}

//class C implements A{
//	
//} 

class AbstractPractice{
	public static void main(String args[])
	{
		A obj= new B();
		obj.method1();
				
	}
}*/
































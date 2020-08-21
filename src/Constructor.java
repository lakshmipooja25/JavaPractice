
/*public class Constructor {
	//  DEFAULT CONSTRUCTOR
	String name;
	int age;
	int a;
	
	public Constructor() {
		//this.a = a;
		System.out.println("default constructor is called");
		System.out.println(name);
	}
	
	void display() {
		System.out.println("calling display method");
		
	}
	public static void main(String args[])
	{
		Constructor c = new Constructor();
		c.display();
		//System.out.println(a);
		
	}*/

	//*****************************************************************
	class Constructor{  
		int id;  
		String name;  
		//method to display the value of id and name  
		void display(){System.out.println(id+" "+name);}  
		  
		public static void main(String args[]){  
		//creating objects  
			Constructor s1=new Constructor();  
			Constructor s2=new Constructor();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  
		}  
	//*******************************************************************
	// PARAMETERIZED CONSTRUCTOR
	/*String name1;
	int age1;
	 
//	Constructor() {
//	System.out.println("default constructor");
//	}
	Constructor(String name,int age) {
		name1=name;
		age1=age;
		System.out.println("parameterized constructor");
		
	}
	
	void display()
	{
		System.out.println(name1);
		System.out.println(age1);
	}
	
	public static void main(String args[])
	{
		//Constructor c =new Constructor();
		Constructor c = new Constructor("laksh",1);
		c.display();
		
	}*/
	
	/* CONSTRUCTOR OVERLOADING
	int age1;
	String subject1;
	public Constructor() {
		System.out.println("default constructor");
	}
	Constructor (String name, int age, String subject)
	{
		String name1=name;
		age1= age;
		 subject1=subject;
		System.out.println(name1);
		
	}
	
	void display() {
		System.out.println(age1);
		System.out.println(subject1);
	}
	public static void main(String args[])
	{
		Constructor c =new Constructor();
		Constructor c1=new Constructor("laksh",10,"maths");
		c1.display();
	}*/
	
	/* COPY CONSTRUCTOR - BY CONSRUCTOR
	String name1,subject1;
	int age1;
	Constructor(String name,int age, String subject) {
	name1=name;
	age1=age;
	subject1=subject;
	}
	
	Constructor(Constructor copy) {
		name1=copy.name1;
		
	}
	
	void display() {
		System.out.println(name1);
		System.out.println(age1);
	}
	public static void main(String args[])
	{
		Constructor c = new Constructor("lakshmi",25,"Physics");
		c.display();
	}
	*/
	//COPY CONSTRUCTOR- COPY VALUES OF ONE OBJECT TO ANOTHER 
	/*String name;
	int age;
	String subject;
	
	Constructor(String n, int a, String s) {
	name=n;
	age=a;
	subject=s;
	//System.out.println(name);
	}
	
	Constructor() {
		//String name_new="puppy";
		//System.out.println(name_new);
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject);
	}
	public static void main(String args []) {
		Constructor c1=new Constructor();
		Constructor c = new Constructor("lakshmi", 25, "English");
		
		c1.name=c.name;
		c1.age=c.age;
		c1.subject=c.subject;
		c1.display();
	}*/


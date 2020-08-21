package MyPractice;


	/*class StaticMain{  
		   int rollno;
		   String name;  
		   static String college ="ITS";//static variable  
		   //constructor  
		   StaticMain(int r, String n){  
		   rollno = r;  
		   name = n;  
		   }  
		   //method to display the values  
		   void display (){System.out.println(rollno+" "+name+" "+college);}  
		}  
	
		
		public class Static{  
		 public static void main(String args[]){  
			 StaticMain s1 = new StaticMain(111,"Karan");  
			 StaticMain s2= new StaticMain(222,"Aryan");  
		
		 s1.display();  
		 s2.display(); 
		 System.out.println(StaticMain.college);
		 }  
		}  
*/

//*********************************************************************************************

/*class Static{  
	 static int a=40;//non static  
	 
	 static void display()
	 {
		 System.out.println("static method");
	 }
	   
	 public static void main(String args[]) //The static method can not use non static data member or call non-static method directly.
	 {  
	  System.out.println(a);  
	 display();
	 }  
	}      */

//**********************************************************************************************************
class Static{  
	static int a; 
	int b;
	int c=20;
	int d =100;
	static int e;
	
	static{
		System.out.println("static block is invoked");
		a=10;
		//b=20; // non static variable not allowed inside static block
		display_static();
		//display(); // non static method not allowed inside static block
		//System.out.println(d);    //non static method not allowed inside static block
	}  
	
	public void display()
	{
		System.out.println(a);
		System.out.println("Non - static data member" + b);
		
		display_static();
	}
	
	static void display_static() 
	{
		//System.out.println(d); // not allowed
		System.out.println(a);
		e=700;
	}
	  
	  public static void main(String args[]){  
	   System.out.println("Hello main");  
	   System.out.println("static data member" + a);
	   Static s = new Static ();
	   s.display();
	   s.display_static();
	   display_static();
	  // System.out.println(d);       //outside class variable not allowed inside static block
	   System.out.println(s.b);
	  }  
	}  

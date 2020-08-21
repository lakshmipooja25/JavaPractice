package MyPractice;

abstract class Bike  {  
	   Bike(){System.out.println("bike is created");}  
	   abstract void run();  
	     void changeGear()
	    {System.out.println("gear changed");} 
	    
	    static void testStatic() {
	    	System.out.println("static method testing");
		}
	    
	    final void testFinal()
	    {
	    	System.out.println("final method test");
	    }
	 }  

	//Creating a Child class which inherits Abstract class  
	 abstract class Honda extends Bike{  
		 Honda(){System.out.println("Honda is created");}  
		 
	 void run(){
		 
		 System.out.println("honda running safely..");}  
	 final void testFinal1()
	    {
	    	System.out.println("final method test 1");
	    }
	 }
	 
	 class HondaSub extends Honda
	 {
		 HondaSub(){System.out.println("Hondasub is created");}  
		void run()
		{
			super.run();
			System.out.println("Honda sub running safely");
			
		}
	 final void testFinal2()
	    {
		 super.run();
	    	System.out.println("final method test 2");
	    }
		
	 }
	 class AbstractPractice{  
	 public static void main(String args[]){  
	  Bike obj = new HondaSub(); 
	  Honda obj1 = new HondaSub();
	  HondaSub obj2= new HondaSub();

	
	  
	  obj.run();  
	  obj1.run();
	  obj2.run();
	  obj.changeGear(); 
	  obj1.changeGear();
	  Bike.testStatic();
	  obj.testFinal();
	  obj1.testFinal();
	  obj1.testFinal1();
	  obj2.testFinal();
	  obj2.testFinal1();
	  
	  obj2.testFinal2();  
	  
	  
	 }  
	}  
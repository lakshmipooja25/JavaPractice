package MyPractice;

/*class Bike{  
	  void run(){System.out.println("running");}  
	}  
	class Polymorphism extends Bike{  
	  void run(){
		  System.out.println("running safely with 60km");
		  super.run();
		  
	  }  
	  
	  
	  public static void main(String args[]){  
	    Bike b = new Polymorphism();//upcasting  
	    b.run();  
	  }  
	}  */

//***********************************************************************************************************************
/*class Bike{  
	  void run(){System.out.println("running");}  
	}  

	class Polymorphism extends Bike{ 
		
	  void run(){System.out.println("running safely with 60km");
	  super.run();
	  }  
	  
	  public static void main(String args[]){  
		  Polymorphism b = new Polymorphism();  
	    b.run();  
	  }  
	}*/

//**************************************************************************************************************************
/*class Bike{  
	 int speedlimit=90;  
	}  
	class Polymorphism extends Bike{  
	 int speedlimit=150;  
	  
	 public static void main(String args[]){  
	  Bike obj=new Polymorphism();  
	  System.out.println(obj.speedlimit);//90  
	}  
	 
	}*/

//*************************************************************************************************************************
	/*class Animal{  
		void eat(){System.out.println("eating");}  
		}  
	class Dog extends Animal{  
		void eat(){System.out.println("eating fruits");}  
		}  
	class Polymorphism extends Dog{  
		void eat(){System.out.println("drinking milk");}  
		public static void main(String args[]){  
		Animal a1,a2,a3;  
		a1=new Animal();  
		a2=new Dog();  
		a3=new Polymorphism();  
		a1.eat();  
		a2.eat();  
		a3.eat();  
		}  
}  */

//*************************************************************************************************************************

	class Animal{  
		void eat(){System.out.println("animal is eating...");}  
		}  
	class Dog extends Animal{  
		void eat(){System.out.println("dog is eating...");}  
		}  
	class Polymorphism extends Dog{  
		public static void main(String args[]){  
		Animal a=new Polymorphism();  
		a.eat();  
		}
	} 

package MyPractice;

/*class Animals{}  
class InstanceOf extends Animals{//Dog inherits Animal  
  
 public static void main(String args[]){  
	 InstanceOf d=new InstanceOf();  
 System.out.println(d instanceof Animals);	//true
 System.out.println(d instanceof InstanceOf);	//true
 }  
}  */

//*******************************************************************************************************************
/*
class InstanceOf{  
	 public static void main(String args[]){  
		 InstanceOf d=null;  
	  System.out.println(d instanceof InstanceOf);//false  
	 }  
	}  */

//*******************************************************************************************************************

/*class Animals{}  
class InstanceOf extends Animals{//Dog inherits Animal  
  
 public static void main(String args[]){  
	 Animals d=new Animals();  
 System.out.println(d instanceof Animals);	//true
 System.out.println(d instanceof InstanceOf);	//false
 }  
} */

//*******************************************************************************************************************

/*class Animals{}  
class InstanceOf extends Animals{//Dog inherits Animal  
  
 public static void main(String args[]){  
	 Animals d=new InstanceOf();  
 System.out.println(d instanceof Animals);	//true
 System.out.println(d instanceof InstanceOf);	//true
 }
}
*/
//*******************************************************************************************************************
/*class Animals { }
class InstanceOf extends Animals {
  static void method(Animals a) {
    if(a instanceof InstanceOf ){
    	InstanceOf d=(InstanceOf)a;//downcasting
       System.out.println("ok downcasting performed");
    } 
    else
    System.out.println("failure");
  }
  public static void main (String [] args) {
    Animals a=new InstanceOf();
    InstanceOf.method(a);
  }
 }*/
//*******************************************************************************************************************

/*class Animals { }
class InstanceOf extends Animals {
  static void method(Animals a) {
    if(a instanceof Animals ){
    	InstanceOf d=(InstanceOf)a;//downcasting
       System.out.println("ok downcasting performed");
    }
    
    else
    System.out.println("failure");
  }
 
  public static void main (String [] args) {
    Animals a=new InstanceOf();
    InstanceOf.method(a);
  }
  
 }*/
//*******************************************************************************************************************

/*class Animals { }
class InstanceOf extends Animals {
  static void method(Animals a) {
    if(a instanceof InstanceOf ){
    	InstanceOf d=(InstanceOf)a;//downcasting
       System.out.println("ok downcasting performed");
    }
    
    else
    System.out.println("failure");
  }
 
  public static void main (String [] args) {
	  Animals a=new Animals();
    InstanceOf.method(a);
  }
  
 }*/
//*******************************************************************************************************************
/*class Animals { }      				//Exception in thread "main" java.lang.ClassCastException: MyPractice.Animals cannot be cast to MyPractice.InstanceOf
class InstanceOf extends Animals {
  static void method(Animals a) {
    if(a instanceof Animals ){
    	InstanceOf d=(InstanceOf)a;//downcasting
       System.out.println("ok downcasting performed");
    }
    
    else
    System.out.println("failure");
  }
 
  public static void main (String [] args) {
	  Animals a=new Animals();
    InstanceOf.method(a);
  }
  
 }*/
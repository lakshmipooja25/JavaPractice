package MyPractice;

import java.io.IOException;

//import java.io.IOException;

/*public class Throw_Throws{

	   static void validate(int age){
	     if(age<18)
	      throw new ArithmeticException("not valid");
	     else
	      System.out.println("welcome to vote");
	   }
	   
	   public static void main(String args[]){
	      validate(13);
	      System.out.println("rest of the code...");
	  }
	}*/
//********************************************************************************************
/*public class Throw_Throws{

	   static void validate(int age) throws IOException  {
	     if(age<18)
	      throw new IOException("not valid");
	     else
	      System.out.println("welcome to vote");
	   }
	   
	   public static void main(String args[]) throws IOException{
	      try {
		   validate(19);
	      }  
	      catch(Exception e){System.out.println("catch handled");}
	      System.out.println("rest of the code...");
	  }
	}
	*/
//********************************************************************************************
	/*class Throw_Throws{  
		  void m() throws ArithmeticException{  
		   throw new ArithmeticException("device error");//checked exception  
			 // System.out.println("new new new");
		  }  
		  void n() throws ArithmeticException { 
		    m();  
		  }
		  void p() throws ArithmeticException{  		    
				n();
		  }
		  
		  public static void main(String args[]) {  
			  Throw_Throws obj=new Throw_Throws();  
		   try {
			obj.p();
		   }
			finally
			{
				System.out.println("final block");
			}
			System.out.println("normal flow...");  
		  }  
		}  
*/
//***************************************************************************************************
/*class Test{  
	 void method() throws IOException{  
	 // System.out.println("device operation performed"); 
	  throw new IOException("device error");  
	 }  
	}  
	class Throw_Throws{  
	   public static void main(String args[]) {//declare exception  
		   Test m=new Test();       
			try {
				m.method();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("normal flow...");  
	  }  
	} */
	
	//***************************************************************************************************
	/*class M{  
		 void method()throws IOException{  
		  throw new IOException("device error");  
		 }  
		}  
		class Throw_Throws{  
		   public static void main(String args[]) throws IOException{//declare exception  
		     M m=new M();  
		     
				m.method();
			 
		  
		    System.out.println("normal flow...");  
		  }  
		}  	*/

//***************************************************************************************************
/*class Parent{  
	  void msg()throws Exception{System.out.println("parent");}  
	}  
	  
	class Throw_Throws extends Parent{  
	  void msg()throws IOException{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new Throw_Throws();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  */
//***************************************************************************************************
 
class Mask{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
class Throw_Throws{  
   public static void main(String args[])throws IOException{//declare exception  
	   Mask m=new Mask();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  
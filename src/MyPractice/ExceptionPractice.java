package MyPractice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*public class ExceptionPractice{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  
	   }catch(NullPointerException e)
	   {System.out.println("cant divide by zero");
	   }  
	   //rest code of the program   
	   
	  }  
	}*/
//********************************************************************************************

/*public class ExceptionPractice { 	  
    public static void main(String[] args) {  
         try  
        {  
        int data1=50/0; //may throw exception   
        }             
        catch(Exception e)  
        {  
            try {
        	
            	int data2=50/0; //may throw exception   
            }
            catch(Exception e1)
            {
            	System.out.println("2nd exception caught");
            }
        }  
    System.out.println("rest of the code");  
    }  
}  */

//********************************************************************************************
/*class ExceptionPractice{  
	 public static void main(String args[]){  
	  try{  
	    try{  
	     System.out.println("going to divide");  
	     int b =39/0;  
	    }
	    catch(ArithmeticException e){System.out.println(e);}  
	    finally {
			System.out.println("executing finally inner code 1 ");
		}
	    try{  
	    int a[]=new int[5];  
	    a[5]=4;  
	    }
	    catch(Exception e){System.out.println(e);}  
	    finally {
			System.out.println("executing finally inner code 2 ");
		}
	    System.out.println("other statement");  
	  }catch(NullPointerException e){System.out.println("handeled");}  
	  finally {
			System.out.println("executing finally outer code");
		}
	  
	  System.exit(0);
	  
	  System.out.println("normal flow.."); 
	  
	 }  
	}  */
//********************************************************************************************
class Parent{
	  void msg() {System.out.println("parent");}
	}

	class ExceptionPractice extends Parent{
	  void msg()throws ArithmeticException{System.out.println("child");}

	  public static void main(String args[]){
	   Parent p=new ExceptionPractice();
	   try{
	   p.msg();
	   }catch(Exception e){}
	  }
	}

//********************************************************************************************

/*public class ExceptionPractice { 	  
    public static void main(String[] args) {  
         try  
        {  
        int data1=50/0; //may throw exception   
        }             
         finally
         {
         	System.out.println("finallly block");
         }
    System.out.println("rest of the code");  
    }  
} 
*/

//**********************************************************************************************
/*public class ExceptionPractice {  	  
    public static void main(String[] args) {           
        try  
        {  
        int data1=50/0; //may throw exception   
  
        }  
        catch(Exception e)  
        {  
       	int data2=50/0; //may throw exception   
        }  
        
    System.out.println("rest of the code");  
    }  
}  */
//**********************************************************************************************
/*public class ExceptionPractice {  	  
    public static void main(String[] args) {           
        try  
        {  
        int data1=50/0; //may throw exception   
       }  
        catch(ArithmeticException e)  
        {  
       	 System.out.println("Arithmetic exception");
	       	try {
	    		String s=null;
	    		System.out.println(s.length());
	    	}
	    	catch(NullPointerException e1)
	    	{
	    		System.out.println("null pointer exception handled");
	    	}
	       	finally {
				System.out.println("null pointer finally");
			}
        }  
        finally {
			System.out.println("Arithmetic pointer finally");
		}
    System.out.println("rest of the code");  
    }  
} */
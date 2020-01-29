import java.io.IOException;

//public class ExceptionHandling {
/*
	public static void main(String args[]) throws InterruptedException
	{
		try {
			String s ="abc";
			int b=Integer.parseInt(s);
			System.out.println(b);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}	
		finally {
			System.out.println("exception handling completed");
		}		
		System.out.println("main program code");
		Thread.sleep(4000);}*/
		
		/*static void validateAge(int number)
		{
			if (number < 18) {
				throw new ArithmeticException("not valid");  
			}		
		}
		
		public static void main(String args[])
		{
			ExceptionHandling.validateAge(10);
			
		}*/
	
/*	void a() throws IOException
	{
		throw new IOException("String Exception");
		//System.out.println("Exception handling incident");
	}
	void b() throws IOException
	
	{
		a();
			
	}
	void c()
	{
		try {
			b();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public static void main(String args[])  
	{
		ExceptionHandling obj = new ExceptionHandling();
					obj.c();			
	}	
}*/
	/*
	class Parent {  
		  void msg() throws Exception{System.out.println("parent");}  
		}  
		  
		class ExceptionHandling extends Parent{  
		  void msg(){  
		    System.out.println("TestExceptionChild");  
		  }  
		  public static void main(String args[]) {  
		   Parent p=new ExceptionHandling();  
		  
			try {
				p.msg();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		  }  
		}  
	*/

/*class Parent{  
	  void msg()throws  Exception{System.out.println("parent");}  
	}  
	  
	class ExceptionHandling extends Parent{  
	  void msg()throws ArithmeticException{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new ExceptionHandling();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  
	*/
	
	
	
	
	
	
	

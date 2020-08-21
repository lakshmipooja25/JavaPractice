package MyPractice;

/*public class Overloading {
static double a =255.5565d;

public static void main(String args[]) {
	System.out.println(a);
}
}
*/
//******************************************************************************************************

class Overloading{  
	  void sum(int a,int b){System.out.println("int arg method invoked");}  
	  void sum(long a,long b){System.out.println("long arg method invoked");}  
	  
	  public static void main(String args[]){  
		  Overloading obj=new Overloading();  
	      obj.sum(20,20);//now int arg sum() method gets invoked  
	  }  
	}  
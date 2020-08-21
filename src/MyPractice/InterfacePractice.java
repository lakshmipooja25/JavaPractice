package MyPractice;

/*interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class InterfacePractice{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println(Drawable.cube(3)); 

}}  
*/

//**********************************************************************************************************
/*interface Drawable{ 
	 final static int a =10;
 void draw();  
default void msg(){System.out.println("default method");}  



default void display_integer()
{
	
	System.out.println(a);
	}
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  

public void getprop()
{
	System.out.println("getting super class properties");
	
}
}  

class Rectanglesub extends Rectangle{  
public void draw(){System.out.println("drawing rectangle sub");} 


} 
class InterfacePractice{  
public static void main(String args[]){  

Drawable d=new Rectangle(); 
InterfacePractice d2=new InterfacePractice(); 
Rectangle rs= new Rectanglesub();

rs.getprop();
rs.draw();
d.draw();  
d.msg();
d.display_integer();
}} */ 

//***********************************************************************************************************
interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class InterfacePractice{  
public static void main(String args[]){  
A a=new M(); 

a.a();  
a.b();  
a.c();  
a.d();  
}}  
interface A
{
void display();

}

  
interface B extends A
{
	void display();
	}
class InterfacePractice implements B
{  
	public void display()
	{
		System.out.println("display Interface A");
	}
	public void display1()
	{
		System.out.println("display interface B");
	}
public static void main(String args[]){  
	  
	  InterfacePractice i = new InterfacePractice();
	  i.display();
	  i.display1();
	  
 }  
 
}

 /*class Animal {
	int i =10;
	void eat(){System.out.println("eating...");}  
	}  
 
 
	class Dog extends Animal{
		int j =20;
	void bark(){System.out.println("barking...");}  
	}  
	
	
	class cat extends Animal{
		int k =30;
	void meow(){System.out.println("meow...");}  
	}  
	
	class Inheritance{  
	public static void main(String args[]){  
	Dog d= new Dog();
	cat c = new cat();
	System.out.println(d.i);
	System.out.println(d.j);
	System.out.println(c.i);
	  
	d.bark();  
	c.meow();
	d.eat();
	c.eat(); 
		
		}
	}*/



 class Animal {
	int i =10;
	void voice(){System.out.println("eating...");}  
	}  
 class Dog extends Animal{
		int j =20;
	void voice(){System.out.println("barking...");}  
	}  
		class cat extends Animal{
		int k =30;
	void voice(){System.out.println("meow...");}  
	}  
	
	class Inheritance{  
	public static void main(String args[]){  
	Animal a = new Dog();
	Animal aa = new cat();
	a.voice();
	aa.voice();
		
		}
	}



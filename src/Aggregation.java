/*class Operation
{
	public int calculateradius(int value)
	{
		return value * value;
	}
}

class Aggregation
{	double pi=3.14;
	Operation op1 = new Operation();
	
	public double calculatearea(int value)
	{	int radius =op1.calculateradius(value);
		return pi*radius;
	}
	public static void main(String args[])
	{
		Aggregation a = new Aggregation();
		double area=a.calculatearea(5);
		System.out.println(area);
	}
	}*/

/*
 class Address
 {
	 String city;
	 String state;
	 String country;

	 
	 Address(String city, String state, String country) {
		 this.city=city;
		this.state=state;
		this.country=country;
	}
	 void displayaddr()
		{
			System.out.println(city+state+country);
		}
		
	  
 }
 
 class Aggregation
 {
	int rollno;
	String name;
	Address addr;
	Aggregation(int rollno, String name,Address addr)
	{
		this.rollno=rollno;
		this.name=name;
		this.addr=addr;
		
		//Address ad= new Address(addr);
	}
	
	void displaydata()
	{
		System.out.println(+rollno+name);
		System.out.println(addr.city+addr.state+addr.country);
	}
	public static void main(String args[]) {
	Address ad= new Address("chennai", "TN", "India");
	Aggregation a = new Aggregation(12345,"laksh", ad);	
	a.displaydata();
	}	
 }*/
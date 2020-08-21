package MyPractice;

/*class Constructor{  
int id = 2;  
String name="laksh";  
//method to display the value of id and name  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
//creating objects  
	Constructor s1=new Constructor();  
	Constructor s2=new Constructor();  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}  */
//*******************************************************************

//Parameterized Constructor
class Constructor{  
    int id;  
    String name;  
    //creating a parameterized constructor  
   
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
     Constructor() {
    	System.out.println("default constructor");
	}
	//method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	
    
    	Constructor s1 = new Constructor(111,"Karan");  
    	Constructor s2 = new Constructor(222,"Aryan"); 
    	Constructor s3 = new Constructor();
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  

//*******************************************************************************************************
/*class Constructor{  
    int id=10;  
    String name;  
    int age;  
    //creating two arg constructor  
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Constructor(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    	Constructor s1 = new Constructor(111,"Karan");  
    	Constructor s2 = new Constructor(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}*/
//*************************************************************************************
/*class Constructor{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Constructor(Constructor s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	Constructor s1 = new Constructor(111,"Karan");  
    	Constructor s2 = new Constructor(s1);  
    s1.display();  
    s2.display();  
   }  
}  */
//******************************************************************************************

/*class Constructor{  
    int id;  
    String name;  
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    Constructor(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	Constructor s1 = new Constructor(111,"Karan");  
    	Constructor s2 = new Constructor();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  */

//***********************************************************************************************************

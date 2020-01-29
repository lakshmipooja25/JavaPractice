
/*class FinalKeyword{  
 final int speedlimit;//final variable  
 FinalKeyword()
 {
	 speedlimit=400;  
 }
 void run(){  
   System.out.println(speedlimit);
 }  
 public static void main(String args[]){  
	 FinalKeyword obj=new  FinalKeyword();  
 obj.run();  
 }  
}*/


/*
class FinalKeyword{  
	public static void main(String args[]){
		int a [] = new int [5];
		a[0]=1;
		a[1]=2;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int b [] = {10,20,30};
		for (int i : b) {
			System.out.println(i);
		}
	}
}*/

/*
class Array
{
	void display(int array[])
	{
		System.out.println(array[0]);
	}
	}
class FinalKeyword{  
	public static void main(String args[]){
	int a []= {10,20,30,40};
	Array a1 = new Array();
	a1.display(a);	
	}
}*/


class FinalKeyword{  
	
	static int[] display()
	{
		int a[]= {10,20,30};
		return a;
	}
	public static void main(String args[]){
	
	int arr[]=display();
	System.out.println(arr[0]);
	}
}







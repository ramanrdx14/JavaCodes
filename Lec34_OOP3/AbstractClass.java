package Lec34_OOP3;
abstract class A{
	int a;
	A(int a){
		this.a = a;
	}
	abstract void m1();  // abstract class contain abstract methods
	void m2() {         // abstract class contains concrete methods
		System.out.println("m2 method");
	}
}
class B extends A{

	B(int a) {
		super(a);
	}

	@Override
	void m1() {
		System.out.println("m1 method");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		//A a = new A();  we cant create objects
		
		A a   = new B(10);
	}

}

/*
what is the difference between the concrete method and abstract method ?

-> Concrete methods  have only method deceleration,method body.
-> abstract  methods have only method deceleration but not method body.

-> Concrete method are possible in abstract class, concrete class.
-> abstract method are possible  in the abstract class and interfaces.
-> if we declare method as abstract then the class must be declared as abstract class.

*/




/*
 what is the difference between the abstract class and concrete class ?
 
 concrete class are able to allow only the concrete methods.
 abstract class are able to allow both concrete method and abstract methods.
 
 concrete class allow us to create the objects and reference variable .
 abstract class does not allow to create the objects but we can create reference variable.
 
 -> abstract class can have the zero number of the abstract methods.
 
 
 NOTE : 
 It is not possible to create object for the abstract class but how we can declare the 
 constructor for the abstract class.
 --> we can declare the constructor for the abstract class because to initialize the 
 	 instance variable of the abstract class.

*/

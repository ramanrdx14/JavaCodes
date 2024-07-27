package Lec34_OOP3;
interface Demo {
	int a=10;  //public static final
	void m1(); //public abstract
	void m2(); //public abstract
	void m3(); //public abstract
	
}
interface I1{
	
}
interface I2{
	
}

interface I3{
	
}
class Test implements Demo,I1,I2,I3{

	@Override
	public void m1() {
		System.out.println("This is m1");
		
	}

	@Override
	public void m2() {
		System.out.println("This is m2");
		
	}

	@Override
	public void m3() {
		System.out.println("This is m3");
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		
		Demo d = new Test();
		d.m1();
		d.m2();
		d.m3();
	}
	
}



/*
	
	classes are able to allow only concrete methods.
	abstract class are able to allow both concrete methods and abstract method.
	interfaces are able to allow only abstract methods.
	
	
	by default all the variable inside the interface are public static final no need to
	define explicitly.
	
	in the case of interface all the methods are by default public and abstract
	no need to declare explicitly.
	
    in the case of interface all the inner classes are static in nature 
    
    abstract classes and concrete classes are able to allow constructor 
    but interface don't allow constructor.
    
    classes and abstract classes are allowing static blocks and instance blocks
    interface doesnot allow the static blocks and instance blocks.
*/
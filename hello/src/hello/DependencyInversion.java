package hello;

interface MyInterface{
	
	void doSomething();
}

class MyClass implements MyInterface {
	
	@Override
	public void doSomething() {
		System.out.println("");
	}
}

public class DependencyInversion {
	
	public static void main (String[] args) {
	MyInterface obj = new MyClass ();
	obj.doSomething ();
	
	}

}

package polymorphism;

public class Overriding1 extends Overriding{
	
public int p = 20;

public void add() {
	
	int a;
	int b;
	int t;
	
	a = 10;
	b = 12;
	t = a+b;
	
	System.out.println(t+super.p);
	
	System.out.println(t+this.p);
}

}

package polymorphism;

public class OverridingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding Details = new Overriding();
		//Details.p;
		
		System.out.println(Details.p);
		
		Details.add();
		
		
		Overriding1 row1 = new Overriding1();
		row1.add();
		
		System.out.println(row1.p);
		
		System.out.println(row1.p);
		
		row1.add();
		
		Overriding Object1 = new Overriding1();
		Object1.add();
		System.out.println(Object1.p);
		


	}

}

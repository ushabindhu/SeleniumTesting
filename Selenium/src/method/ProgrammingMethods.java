package method;

public class ProgrammingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodPractice row1 = new MethodPractice();
		//without return type
		row1.AddMethod1();
		//without return type
		row1.AddMethod2(100, 100);
		
		
		int s = row1.AddMethod3();
		System.out.println(s);
		
		int P = row1.AddMethod4(200, 100);
		System.out.println(P);
		
		int n  = row1.add(10,5, 6);

	}

}

package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj=new <String>ArrayList();
		//ArrayList<double> obj = new <double>ArrayList();
		
		obj.add("Usha");
		//obj.add(367);
		//obj.add(28/04);
		obj.add("Hyderabad");
		//obj.add('F');
		
		Iterator it=obj.iterator();
		while(it.hasNext()){
			Object el=it.next();
			System.out.println(el);
		
		

	}

}
}

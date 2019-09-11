package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj=new ArrayList();
		obj.add("Usha");
		obj.add(367);
		obj.add(28/04);
		obj.add("Hyderabad");
		obj.add('F');
		
		System.out.println(obj);
		
		int size=obj.size();
		System.out.println(size);
		
		for (int i=0;i<size;i++){
			  System.out.println("valuesvvvvvvv          "+obj.get(i));
		  }
		
		  
	}
}


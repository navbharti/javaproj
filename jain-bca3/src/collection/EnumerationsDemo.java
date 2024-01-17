package collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationsDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector();
		for(int i=1; i<=10; i++) {
			v.addElement(i);
		}
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer val = (Integer) e.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		System.out.println(v);
		System.out.println(e.getClass().getName());
	}

}

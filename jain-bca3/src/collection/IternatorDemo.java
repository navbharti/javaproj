package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IternatorDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for(int i=0; i<=10; i++) {
			l.add(i);
		}
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			Integer val = (Integer) itr.next();
			if(val%2 == 0)
				System.out.println(val);
			else
				itr.remove();
		}
		System.out.println(l);
	}

}

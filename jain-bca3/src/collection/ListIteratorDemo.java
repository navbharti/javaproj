package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList();
		l.add("Bala");
		l.add("Rama");
		l.add("Mahesh");
		l.add("Chirag");
		l.add("Bhunesh");
		System.out.println(l);
		ListIterator<String> ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String) ltr.next();
			if(s.equals("Mahesh")) {
				ltr.remove();
			}
			else if(s.equals("Rama")) {
				ltr.add("Babu");
			}
			else if(s.equals("Chirag")) {
				ltr.set("Cheeraag");
			}
		}
		System.out.println(l);
		
	}

}

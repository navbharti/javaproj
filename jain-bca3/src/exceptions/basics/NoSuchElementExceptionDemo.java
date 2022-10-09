// Java program to demonstrate NoSuchElementException
package exceptions.basics;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchElementExceptionDemo {
		public static void main(String[] args)
		{

			Set exampleleSet = new HashSet();

			Hashtable exampleTable = new Hashtable();

			exampleleSet.iterator().next();
			//accessing Set
		
			exampleTable.elements().nextElement();
			//accessing Hashtable
		
			// This throws a NoSuchElementException as there are
			// no elements in Set and HashTable and we are
			// trying to access elements
		}
}

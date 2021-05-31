package app;

import collector.Container;
import collector.MyContainer;
import iterator.Iterator;

public class IteratorClient {

	public static void main(String[] args) {
		Container<String> container = new MyContainer<String>();
		container.add("Abhishek");
		container.add("A");
		container.add("B");
		container.add("C");
		container.add("D");
		
		Iterator iterator = container.getIterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}

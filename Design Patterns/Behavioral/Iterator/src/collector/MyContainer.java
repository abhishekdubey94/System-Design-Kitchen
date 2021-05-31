package collector;

import java.util.ArrayList;

import iterator.Iterator;
import iterator.MyIterator;

public class MyContainer<T> implements Container {
	
	ArrayList<T> myList;
	

	public MyContainer() {
		this.myList = new ArrayList<>();
	}

	@Override
	public Iterator getIterator() {
		Iterator itr = new MyIterator<T>(this);
		return itr;
	}


	@Override
	public void add(Object obj) {
		myList.add((T) obj);		
	}

	@Override
	public int size() {
		return myList.size();
	}
	
	@Override
	public Object get(int index) {
		return myList.get(index);
	}
}

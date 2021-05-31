package collector;

import iterator.Iterator;

public interface Container<T> {

	public Iterator getIterator();
	public void add(T obj);
	public int size();
	public Object get(int index);
}

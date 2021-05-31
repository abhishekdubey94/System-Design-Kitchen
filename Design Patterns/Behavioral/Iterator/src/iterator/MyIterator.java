package iterator;

import collector.Container;

public class MyIterator<T> implements Iterator {
	Container<T> container;
	int index;

	
	public MyIterator(Container<T> container) {
		this.container = container;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index<container.size();
	}

	@Override
	public Object next() {
		return container.get(index++);
	}

}

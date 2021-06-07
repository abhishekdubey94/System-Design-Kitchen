package visitor;

import item.Book;
import item.Fruit;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}

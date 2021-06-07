package item;

import visitor.ShoppingCartVisitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}

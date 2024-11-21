package Source;

import java.util.Vector;


public class ShoppingCart {
	private Vector<Item> items;
	private int c = 0;

	public ShoppingCart() {
		items = new Vector<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public boolean removeItem(String name, int price) {
		boolean bool = false;
		for (int i = 0; i < items.size(); i++) {
			if (name.equals(items.get(i).getName()) && (price == items.get(i).getPrice())) {
				items.remove(items.get(i));
				bool = true;
				// return true;
			}
		}
		return bool;
	}

	public boolean removeItem2(Item item) {

		boolean bool = false;
		for (Item it : items) {
			if (item.getName().equals(it.getName()) && (item.getPrice() == it.getPrice())) {
				items.remove(it);
				bool = true;

			}
		}
		return bool;
	}

	public boolean removeItemWithNameAndPrice(String name, int Price) {
		// boolean bool = false;
		for (int i = 0; i < items.size(); i++) {
			if (name.equals(items.get(i).getName()) && (Price == items.get(i).getPrice())) {
				items.remove(items.get(i));
				return true;
			}
		}
		return false;
	}

	public int itemCount() {
		return items.size();
	}

	public int totalPrice() {
		c = 0;
		for (int i = 0; i < items.size(); i++)
			c += items.get(i).getPrice();
		return c;
	}

}

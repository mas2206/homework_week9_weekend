package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 07/05/2017.
 */

public class Basket {

    private ArrayList<Item> contentsOfBasket;

    public Basket() {
        this.contentsOfBasket = new ArrayList<Item>();
    }

    public int getNumberOfItemsInBasket() {
        return contentsOfBasket.size();
    }

    public void addItemToBasket(Item item) {
        contentsOfBasket.add(item);
    }

    public void emptyBasket() {
        contentsOfBasket.clear();
    }

    public Item removeItemFromBasket() {
        if (getNumberOfItemsInBasket() > 0) {
            return contentsOfBasket.remove(0);
        }
        return null;
    }

    public int getValueOfItemsInBasket() {
        int total = 0;
        for (Item item : contentsOfBasket) {
            total += item.itemValue();
        }
        return total;
    }

}

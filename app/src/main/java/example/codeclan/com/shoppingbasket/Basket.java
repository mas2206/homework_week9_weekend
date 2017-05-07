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

}

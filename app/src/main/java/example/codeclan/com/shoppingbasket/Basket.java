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

    public void removeItemFromBasket(Item item) {
        contentsOfBasket.remove(item);
    }

    public int getTotalCostOfBasket() {
        int totalCost = 0;
        for (Item item : contentsOfBasket) {
            totalCost += item.itemCost();
        }
        return totalCost;
    }

    public void applyBuyOneGetOneFreeDeal(Item freeItem) {
        freeItem = new Item() {
            @Override
            public int itemCost() {
                return 0;
            }
        };
        addItemToBasket(freeItem);
    }

//    public int applyTenPercentOffDiscount() {
//        if (getTotalCostOfBasket() > 2000) {
//            return Math.round((getTotalCostOfBasket() - getTotalCostOfBasket() * 0.1));
//        }
//        return getTotalCostOfBasket();
//    }

}

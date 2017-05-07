package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/05/2017.
 */

public class BasketTest {

    Basket basket;
    Bread bread;
    Chicken chicken;
    Eggs eggs;
    Milk milk;
    Pasta pasta;

    @Before
    public void before() {
        basket = new Basket();
        bread = new Bread();
        chicken = new Chicken();
        eggs = new Eggs();
        milk = new Milk();
        pasta = new Pasta();
    }

    @Test
    public void basketStartsEmpty() {
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddBreadToBasket() {
        basket.addItemToBasket(bread);
        assertEquals(1, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddChickenToBasket() {
        basket.addItemToBasket(chicken);
        assertEquals(1, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddEggsToBasket() {
        basket.addItemToBasket(eggs);
        assertEquals(1, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddMilkToBasket() {
        basket.addItemToBasket(milk);
        assertEquals(1, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddPastaToBasket() {
        basket.addItemToBasket(pasta);
        assertEquals(1, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canAddMultipleItemsToBasket() {
        basket.addItemToBasket(bread);
        basket.addItemToBasket(eggs);
        basket.addItemToBasket(milk);
        assertEquals(3, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canEmptyBasketContainingMultipleItems() {
        basket.addItemToBasket(bread);
        basket.addItemToBasket(eggs);
        basket.addItemToBasket(milk);
        basket.emptyBasket();
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemoveBreadFromBasket() {
        basket.addItemToBasket(bread);
        basket.removeItemFromBasket(bread);
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemoveChickenFromBasket() {
        basket.addItemToBasket(chicken);
        basket.removeItemFromBasket(chicken);
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemoveEggsFromBasket() {
        basket.addItemToBasket(eggs);
        basket.removeItemFromBasket(eggs);
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemoveMilkFromBasket() {
        basket.addItemToBasket(milk);
        basket.removeItemFromBasket(milk);
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemovePastaFromBasket() {
        basket.addItemToBasket(pasta);
        basket.removeItemFromBasket(pasta);
        assertEquals(0, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canRemoveMultipleItemsFromBasket() {
        basket.addItemToBasket(bread);
        basket.addItemToBasket(bread);
        basket.addItemToBasket(bread);
        basket.addItemToBasket(chicken);
        basket.addItemToBasket(milk);
        basket.addItemToBasket(bread);
        basket.removeItemFromBasket(bread);
        basket.removeItemFromBasket(bread);
        basket.removeItemFromBasket(chicken);
        assertEquals(3, basket.getNumberOfItemsInBasket());
    }

    @Test
    public void canCalculateTotalCostOfBasket() {
        basket.addItemToBasket(pasta);
        basket.addItemToBasket(chicken);
        assertEquals(495, basket.getTotalCostOfBasket());
    }

    @Test
    public void buyOneGetOneFreeTest() {
        basket.addItemToBasket(pasta);
        basket.applyBuyOneGetOneFreeDeal(pasta);
        assertEquals(2, basket.getNumberOfItemsInBasket());
        assertEquals(40, basket.getTotalCostOfBasket());
    }

    @Test
    public void buyOneGetOneFreeWorksWithMultipleItems() {
        basket.addItemToBasket(milk);
        basket.applyBuyOneGetOneFreeDeal(milk);
        basket.addItemToBasket(milk);
        basket.applyBuyOneGetOneFreeDeal(milk);
        basket.addItemToBasket(bread);
        basket.applyBuyOneGetOneFreeDeal(bread);
        basket.addItemToBasket(pasta);
        assertEquals(7, basket.getNumberOfItemsInBasket());
        assertEquals(345, basket.getTotalCostOfBasket());
    }

}

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
        Item item = basket.removeItemFromBasket();
        Bread itemToBeRemoved = (Bread)item;
        assertEquals("Thick sliced loaf, ideal for toasties", itemToBeRemoved.itemDescription());
    }

    @Test
    public void canRemoveChickenFromBasket() {
        basket.addItemToBasket(chicken);
        Item item = basket.removeItemFromBasket();
        Chicken itemToBeRemoved = (Chicken)item;
        assertEquals("A large whole chicken", itemToBeRemoved.itemDescription());
    }

    @Test
    public void canRemoveEggsFromBasket() {
        basket.addItemToBasket(eggs);
        Item item = basket.removeItemFromBasket();
        Eggs itemToBeRemoved = (Eggs)item;
        assertEquals("Six large free range eggs", itemToBeRemoved.itemDescription());
    }

    @Test
    public void canRemoveMilkFromBasket() {
        basket.addItemToBasket(milk);
        Item item = basket.removeItemFromBasket();
        Milk itemToBeRemoved = (Milk)item;
        assertEquals("Semi-skimmed milk", itemToBeRemoved.itemDescription());
    }

    @Test
    public void canRemovePastaFromBasket() {
        basket.addItemToBasket(pasta);
        Item item = basket.removeItemFromBasket();
        Pasta itemToBeRemoved = (Pasta)item;
        assertEquals("Very basic penne pasta", itemToBeRemoved.itemDescription());
    }

    @Test
    public void canCalculateValueOfBasket() {
        basket.addItemToBasket(pasta);
        basket.addItemToBasket(chicken);
        assertEquals(495, basket.getValueOfItemsInBasket());
    }

}

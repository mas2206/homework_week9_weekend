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

}

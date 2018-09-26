package onlineShop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {
    private Basket basket;
    private Item itemInBasket;
    private Item item2InBasket;
    private Item newItem;

    @Before
    public void setUp(){
        basket = new Basket();
        itemInBasket = new Item("cake", 6);
        item2InBasket = new Item("banana", 10);
        newItem = new Item("carrot", 4);
        basket.basketContents.put(itemInBasket, 2);
        basket.basketContents.put(item2InBasket, 3);
    }

    @Test
    public void addToBasketNewItem() {
        basket.addToBasket(newItem, 3);
        assertTrue(3==basket.basketContents.get(newItem));
    }
    @Test
    public void addToBasketDuplicatedItem() {
        basket.addToBasket(itemInBasket, 3);
        assertTrue(5==basket.basketContents.get(itemInBasket));
    }
    @Test
    public void addANegativeQuantityToBasket(){
        try{
            basket.addToBasket(newItem, -1);
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantity must be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void removeExisitingQuantityOfItemsFromBasket() {
        basket.removeFromTheBasket(itemInBasket, 2);
        assertFalse(basket.basketContents.containsKey(itemInBasket));
    }

    @Test
    public void removePartOfItemsFromBasket(){
        basket.removeFromTheBasket(itemInBasket, 1);
        assertTrue(1==basket.basketContents.get(itemInBasket));
    }

    @Test
    public void removeNonExistingItemFromBasket(){
        try{
            basket.removeFromTheBasket(newItem, 1);
        }
        catch(IllegalArgumentException e){
            assertEquals("You don't have this item in your basket.", e.getMessage());
        }
    }

    @Test
    public void removeTooLargeNumberOfItemsFromBasket(){
        try{
            basket.removeFromTheBasket(itemInBasket, 7);
        }
        catch(IllegalArgumentException e){
            assertEquals("You don't have enough number of items in your basket.", e.getMessage());
        }
    }

    @Test
    public void removeANegativeQuantityFromBasket(){
        try{
            basket.removeFromTheBasket(itemInBasket, -2);
        }
        catch(IllegalArgumentException e){
            assertEquals("Quantity must be greater than zero.", e.getMessage());
        }
    }

    @Test
    public void showBasketContents() {
    }

    @Test
    public void showTheTotalSum() {
        assertTrue(42==basket.showTheTotalSum());
    }
}
package onlineShop;

public interface BasketInterface {
    public void addToBasket(Item item, int quantity);
    public void removeFromTheBasket(Item item, int quantity);
    public void showBasketContents();
    public double showTheTotalSum();
}

package onlineShop;

import java.util.HashMap;
import java.util.Map;

public class Basket implements BasketInterface{
    Map<Item, Integer> basketContents = new HashMap<>();

    @Override
    public void addToBasket(Item item, int quantity) {
        try{
            checkConditionsForAdd(quantity);
            if(basketContents.containsKey(item)){
                basketContents.put(item, basketContents.get(item)+quantity);
            }
            else{
                basketContents.put(item, quantity);
            }
        }
        catch(IllegalArgumentException e){}
    }

    @Override
    public void removeFromTheBasket(Item item, int quantity) {
        try{
            checkConditionsForRemove(item, quantity);
            basketContents.put(item, basketContents.get(item)-quantity);
            if(basketContents.get(item)==0){
                basketContents.remove(item);
            }
        }
        catch(IllegalArgumentException e){}
    }

    @Override
    public void showBasketContents() {
        System.out.println("Zawartość koszyka");
        basketContents.forEach((i,q)-> System.out.println("towar: "+i+", ilość: "+q));
    }

    @Override
    public double showTheTotalSum() {
        final double[] totalSum = {0};
        basketContents.forEach((i, q) -> totalSum[0]+=i.getPrice()*q);
        System.out.println(totalSum[0]);
        return totalSum[0];
    }

    public void checkConditionsForAdd (int quantity) throws  IllegalArgumentException{
        if(quantity<0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
    }
    public void checkConditionsForRemove(Item item, int quantity) throws IllegalArgumentException{
        if(quantity<0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        if(!basketContents.containsKey(item)){
            throw new IllegalArgumentException("You don't have this item in your basket.");
        }
        if(basketContents.get(item)<quantity){
            throw new IllegalArgumentException("You don't have enough number of items in your basket");
        }
    }
}

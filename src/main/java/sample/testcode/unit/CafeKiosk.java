package sample.testcode.unit;

import lombok.Getter;
import sample.testcode.unit.beverage.Beverage;
import sample.testcode.unit.order.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CafeKiosk {

    private final List<Beverage> beverages = new ArrayList<Beverage>();

    public void add (Beverage beverage) {
        beverages.add(beverage);
    }

    public void removee (Beverage beverage) {
        beverages.remove(beverage);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Beverage beverage : beverages) {
            totalPrice += beverage.getPrice();
        }
        return totalPrice;
    }

    public Order createOrder() {
        return new Order(LocalDateTime.now(), beverages);
    }
}

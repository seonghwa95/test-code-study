package sample.testcode.unit;

import sample.testcode.unit.beverage.Americano;
import sample.testcode.unit.beverage.Latte;

public class CafeKioskRunner {

    public static void main(String[] args) {

        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());
        System.out.println(">>> 아메리카노 추가");
        cafeKiosk.add(new Latte());
        System.out.println(">>> 카페라떼 추가");

        int totalPrice = cafeKiosk.calculateTotalPrice();
        System.out.println("총 주문가격 : " + totalPrice);
    }
}

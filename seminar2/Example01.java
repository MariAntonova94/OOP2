package org.example.OOP.seminar2;

public class Example01 {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Елена ";

        Market market = new Market();
        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}

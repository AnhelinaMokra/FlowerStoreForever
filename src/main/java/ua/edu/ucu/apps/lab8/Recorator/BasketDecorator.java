package ua.edu.ucu.apps.lab8.Recorator;

import ua.edu.ucu.apps.lab8.Model.Flower;

public class BasketDecorator extends FlowerDecorator {

    public BasketDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4.0;
    }

    @Override
    public String getDescription() {
        return item.getName() + " now is in a basket.";
    }

}
package ua.edu.ucu.apps.lab8.Recorator;

import ua.edu.ucu.apps.lab8.Model.Flower;

public class RibbonDecorator extends FlowerDecorator {

    public RibbonDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40.0;
    }

    @Override
    public String getDescription() {
        return item.getName() + " now has a ribbon.";
    }

}
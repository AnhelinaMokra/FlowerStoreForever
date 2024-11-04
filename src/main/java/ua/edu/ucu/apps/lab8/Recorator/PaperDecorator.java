package ua.edu.ucu.apps.lab8.Recorator;

import ua.edu.ucu.apps.lab8.Model.Flower;

public class PaperDecorator extends FlowerDecorator {

    public PaperDecorator(Flower flower) {
        super(flower);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13.0;
    }

    @Override
    public String getDescription() {
        return item.getName() + " now is wrapped in paper.";
    }

}
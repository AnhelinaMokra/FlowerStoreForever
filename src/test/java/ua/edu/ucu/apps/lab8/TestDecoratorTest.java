package ua.edu.ucu.apps.lab8;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.lab8.Model.Flower;
import static org.junit.jupiter.api.Assertions.*;
import ua.edu.ucu.apps.lab8.Recorator.*;

public class TestDecoratorTest {
    @Test
    public void testPaper() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(20.0);
        FlowerDecorator paperWrappedFlower = new PaperDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 33.0);
        assertEquals(paperWrappedFlower.getDescription(), "Rose now is wrapped in paper.");
    }

    @Test
    public void testBasket() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(20.0);
        FlowerDecorator paperWrappedFlower = new BasketDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 24.0);
        assertEquals(paperWrappedFlower.getDescription(), "Rose now is in a basket.");
    }

    @Test
    public void testRibbon() {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setPrice(20.0);
        FlowerDecorator paperWrappedFlower = new RibbonDecorator(flower);
        assertEquals(paperWrappedFlower.getPrice(), 60.0);
        assertEquals(paperWrappedFlower.getDescription(), "Rose now has a ribbon.");
    }
}
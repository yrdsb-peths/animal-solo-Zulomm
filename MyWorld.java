import greenfoot.*;
/**
 * my World
 * 
 * Lionson
 * 4/29/2025
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Bee bee = new Bee();
        addObject(bee, 100, 100);
        
        Flower flower = new Flower();
        addObject(flower, 500, 200);
    }
}

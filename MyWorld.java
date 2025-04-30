import greenfoot.*;
/**
 * my World
 * 
 * Lionson
 * 4/29/2025
 */
public class MyWorld extends World {
    public MyWorld() {
        super(1200, 800, 1);
        Bee bee = new Bee();
        addObject(bee, 200, 200);
        
        createFlower();
    }
    
    public void createFlower()
    {
        Flower flower = new Flower();
        int x = Greenfoot.getRandomNumber(1200);
        int y = 0;
        addObject(flower, x, y);
    }
}

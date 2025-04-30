import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Work Bee
 * 
 *Lionson
 * 4/29/2025    
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the TEST wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        eat();       
    }
    public void eat()
    {
        //Eat and spawn
        if(isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFlower();
        }
    }
}

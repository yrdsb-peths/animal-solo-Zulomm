import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Work Bee
 * *Lionson
 * 4/29/2025    
 */
public class Bee extends Actor
{
    GreenfootSound ding = new GreenfootSound("ding.mp3"); 
    GreenfootImage[] flyRight = new GreenfootImage[17];
    GreenfootImage[] flyLeft = new GreenfootImage[17];  
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Bee()
    {
        for(int i = 0; i< flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/walk/tile00" + i + ".png");
            flyRight[i].scale(100,75);
        }
        
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/walk/tile00" + i + ".png");
            flyLeft[i].mirrorHorizontally();
            flyLeft[i].scale(100,75);
        }
        
        animationTimer.mark();
        
        setImage(flyRight[0]);
    }
    
    //animate
    int imageIndex = 0;
    public void animateBee()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(flyRight[imageIndex]);
            imageIndex = (imageIndex + 1) % flyRight.length;
        }
        else
        {
            setImage(flyLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % flyLeft.length;
        }

    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-10);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(10);
            facing = "right";
        }
        
        eat();
        // animate
        
        animateBee();
    }
    public void eat()
    {
        //Eat and spawn
        if(isTouching(Flower.class))
        {
            removeTouching(Flower.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFlower();
            world.increaseScore();
            ding.play();
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen here.
 * 
 * @author LM 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Working Bee", 150);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,908,171);
        bee.setLocation(897,171);
        bee.setLocation(908,216);
        Label label = new Label("Press <space> to start!", 50);
        addObject(label,480,384);
        label.setLocation(536,386);
        bee.setLocation(900,198);
        label.setLocation(547,415);
        label.setLocation(645,348);
        label.setLocation(424,446);
        label.setLocation(424,380);
        label.setLocation(480,362);
        bee.setLocation(935,208);
        label.setLocation(581,383);
        label.setLocation(519,407);
    }
}

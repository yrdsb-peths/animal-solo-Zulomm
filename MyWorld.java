import greenfoot.*;
/**
 * my World
 * 
 * Lionson
 * 4/29/2025
 */
public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {  
        //Two object
        super(1200, 800, 1, false);
        Bee bee = new Bee();
        addObject(bee, 100, 400);
        //score board
        scoreLabel = new Label(0,50);
        addObject(scoreLabel, 20, 20);
        
        createFlower();
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    //end game(it's really doesn't work for my project be cause flower can move);
    public void endGame()
    {
        Label gameOverLabel = new Label("GG" , 300);
        addObject(gameOverLabel, 600, 400);
    }
    public void createFlower()
    {
        Flower flower = new Flower();
        int x = Greenfoot.getRandomNumber(1200);
        int y = 50;
        addObject(flower, x, y);
    }
}

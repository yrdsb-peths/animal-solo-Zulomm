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
    int level = 1;
    public MyWorld() {  
        //Two object
        super(1000, 600, 1, false);
        setBackground("images/background.png");
        Bee bee = new Bee();
        addObject(bee, 100, 500);
        //score board
        scoreLabel = new Label(0,50);
        addObject(scoreLabel, 20, 20);
        
        createFlower();
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 5 == 0)
        {
            level++;
        }
    }
    
    //end game(it's really doesn't work for my project be cause flower can move);
    public void endGame()
    {
        Label gameOverLabel = new Label("GG" , 300);
        addObject(gameOverLabel, 500, 300);
    }
    public void createFlower()
    {
        Flower flower = new Flower();
        flower.setSpeed(level);
        int x = Greenfoot.getRandomNumber(1000);
        int y = -50;
        addObject(flower, x, y);
    }
}

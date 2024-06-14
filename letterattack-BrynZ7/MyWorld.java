import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our Hero protects.
 * 
 * @author Zhu 
 * @version June 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Hero hero = new Hero();
        addObject(hero, 50, 300);
        Range range = new Range();
        addObject(range, 125, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createEnemy();
        
        
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create a random enemy.
     */
    public void createEnemy()
    {
        int enemyType = Greenfoot.getRandomNumber(2);
        
        if(enemyType == 0)
        {
            ConsonantEnemy enemy = new ConsonantEnemy();
            
            addObject(enemy, 600, 300);
        }
        
        if(enemyType == 1)
        {
            VowelEnemy enemy = new VowelEnemy();
            
            addObject(enemy, 600, 300);
        }
        
    }
    
    /**
     * End the game and draw "Game Over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}

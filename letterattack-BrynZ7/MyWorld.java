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
    static String letter = "";
    Enemy enemy;
    Label scoreLabel;
    EnemyLabel enemyLabel;
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
        addObject(scoreLabel, 100, 50);
        
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
        int enemyType = Greenfoot.getRandomNumber(26);
        if(enemyType == 0)
        {
            letter = "A";
        }
        else if(enemyType == 1)
        {
            letter = "B";
        }
        else if(enemyType == 2)
        {
            letter = "C";
        }
        else if(enemyType == 3)
        {
            letter = "D";
        }
        else if(enemyType == 4)
        {
            letter = "E";
        }
        else if(enemyType == 5)
        {
            letter = "F";
        }
        else if(enemyType == 6)
        {
            letter = "G";
        }
        else if(enemyType == 7)
        {
            letter = "H";
        }
        else if(enemyType == 8)
        {
            letter = "I";
        }
        else if(enemyType == 9)
        {
            letter = "J";
        }
        else if(enemyType == 10)
        {
            letter = "K";
        }
        else if(enemyType == 11)
        {
            letter = "L";
        }
        else if(enemyType == 12)
        {
            letter = "M";
        }
        else if(enemyType == 13)
        {
            letter = "N";
        }
        else if(enemyType == 14)
        {
            letter = "O";
        }
        else if(enemyType == 15)
        {
            letter = "P";
        }
        else if(enemyType == 16)
        {
            letter = "Q";
        }
        else if(enemyType == 17)
        {
            letter = "R";
        }
        else if(enemyType == 18)
        {
            letter = "S";
        }
        else if(enemyType == 19)
        {
            letter = "T";
        }
        else if(enemyType == 20)
        {
            letter = "U";
        }
        else if(enemyType == 21)
        {
            letter = "V";
        }
        else if(enemyType == 22)
        {
            letter = "W";
        }
        else if(enemyType == 23)
        {
            letter = "X";
        }
        else if(enemyType == 24)
        {
            letter = "Y";
        }
        else if(enemyType == 25)
        {
            letter = "Z";
        }
        
        enemy = new Enemy();
        addObject(enemy, 600, 300);
        
        enemyLabel = new EnemyLabel(letter, 50);
        addObject(enemyLabel, 600, 300);
    }
    
    /**
     * Remove the enemy.
     */
    public void removeEnemy()
    {
        removeObject(enemy);
    }
    
    /**
     * Remove the enemy label.
     */
    public void removeEnemyLabel()
    {
        removeObject(enemyLabel);
    }
    
    /**
     * End the game and draw "Game Over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        removeObject(enemyLabel);
    }
}

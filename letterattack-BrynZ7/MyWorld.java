import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our Hero protects.
 * 
 * @author Bryan Zhu 
 * @version June 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    static String letter = "";
    Enemy enemy;
    Label scoreLabel;
    EnemyLabel enemyLabel;
    GreenfootSound gameOverSound = new GreenfootSound("game-over.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Hero hero = new Hero();
        addObject(hero, 80, 300);
        
        HeroHitbox hitbox = new HeroHitbox();
        addObject(hitbox, 80, 300);
        
        Range range = new Range();
        addObject(range, 155, 300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 100, 50);
        
        Label tipLabel = new Label("Tip: You can hold the key down!", 30);
        addObject(tipLabel, 300, 120);
        
        createEnemy();
        
        
    }
    
    /**
     * Add points.
     */
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
        String[] enemyLetter = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int enemyIndex = Greenfoot.getRandomNumber(26);
        
        enemy = new Enemy();
        addObject(enemy, 600, 300);
        
        letter = enemyLetter[enemyIndex];
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
     * End the game, play the game over sound, and draw "Game Over"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        gameOverSound.play();
        addObject(gameOverLabel, 300, 200);
        removeObject(enemyLabel);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemy.
 * 
 * @author Bryan Zhu 
 * @version June 2024
 */
public class Enemy extends Actor
{
    static int pointAmount = 1;
    /**
     * Constructor
     */
    public Enemy()
    {
        GreenfootImage onePoint = new GreenfootImage("images/one.png");
        GreenfootImage threePoints = new GreenfootImage("images/three.png");
        GreenfootImage fivePoints = new GreenfootImage("images/five.png");
        GreenfootImage tenPoints = new GreenfootImage("images/ten.png");
        int enemyType = Greenfoot.getRandomNumber(100);
        if(enemyType < 55)
        {
            pointAmount = 1;
            setImage(onePoint);
        }
        else if(enemyType >= 55 && enemyType < 85)
        {
            pointAmount = 3;
            setImage(threePoints);
        }
        else if(enemyType >= 85 && enemyType < 95)
        {
            pointAmount = 5;
            setImage(fivePoints);
        }
        else if(enemyType >= 95)
        {
            pointAmount = 10;
            setImage(tenPoints);
        }
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-5);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(HeroHitbox.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}

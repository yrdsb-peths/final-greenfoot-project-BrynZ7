import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The vowel enemy, worth 2x points.
 * 
 * @author Zhu 
 * @version June 2024
 */
public class VowelEnemy extends Actor
{
    public VowelEnemy()
    {
        GreenfootImage onePoint = new GreenfootImage("images/one.png");
        GreenfootImage threePoints = new GreenfootImage("images/three.png");
        GreenfootImage fivePoints = new GreenfootImage("images/five.png");
        GreenfootImage tenPoints = new GreenfootImage("images/ten.png");
        int enemyType = Greenfoot.getRandomNumber(100);
        int pointAmount = 1;
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
     * Act - do whatever the VowelEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-5);
        
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Hero.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}


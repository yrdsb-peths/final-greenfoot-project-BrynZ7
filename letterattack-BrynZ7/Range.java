import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The range that the Hero can attack in.
 * 
 * @author Zhu 
 * @version June 2024
 */
public class Range extends Actor
{
    SimpleTimer attackTimer = new SimpleTimer();
    
    public Range()
    {
        GreenfootImage attackRange = new GreenfootImage("images/attack-range.png");
        setImage(attackRange);
        attackRange.scale(75, 50);
        
        attackTimer.mark();
    }
    
    /**
     * Act - do whatever the Range wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        attack();
    }
    
    public void attack()
    {
        if(Greenfoot.isKeyDown("z"))
        {
            if(isTouching(ConsonantEnemy.class))
            {
                removeTouching(ConsonantEnemy.class);
                MyWorld world = (MyWorld) getWorld();
                world.createEnemy();
                world.increaseScore();
            }
            return;
        }
        if(Greenfoot.isKeyDown("x"))
        {
            if(isTouching(VowelEnemy.class))
            {
                removeTouching(VowelEnemy.class);
                MyWorld world = (MyWorld) getWorld();
                world.createEnemy();
                world.increaseScore();
            }
            return;
        }
        if(attackTimer.millisElapsed() < 1000)
        {
            return;
        }
        attackTimer.mark();
    }
}

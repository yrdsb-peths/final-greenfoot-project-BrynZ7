import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The range that the Hero can attack in.
 * 
 * @author Zhu 
 * @version June 2024
 */
public class Range extends Actor
{
    GreenfootSound addPointsSound = new GreenfootSound("gain-points.mp3");
    public Range()
    {
        GreenfootImage attackRange = new GreenfootImage("images/attack-range.png");
        setImage(attackRange);
        attackRange.scale(75, 50);
        
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
        if(Greenfoot.isKeyDown(MyWorld.letter.toLowerCase()))
        {
            if(isTouching(EnemyLabel.class))
            {
                MyWorld world = (MyWorld) getWorld();
                for(int i = 0; i < Enemy.pointAmount; i++)
                {
                    world.increaseScore();
                }
                addPointsSound.play();
                world.removeEnemy();
                world.removeEnemyLabel();
                
                world.createEnemy();
            }
        }
    }
}

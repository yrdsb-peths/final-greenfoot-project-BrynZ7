import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Hero, slayer of letters.
 * 
 * @author Bryan Zhu 
 * @version June 2024
 */
public class Hero extends Actor
{
    GreenfootImage idle = new GreenfootImage("images/hero-slash/idle.png");
    GreenfootImage[] slash = new GreenfootImage[10];
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Hero()
    {
        for(int i = 0; i < slash.length; i++)
        {
            slash[i] = new GreenfootImage("images/hero-slash/slash" + i + ".png");
            slash[i].scale(150, 150);
        }
        animationTimer.mark();
        idle.scale(150, 150);
        setImage(idle);
    }
    
    /**
     * Animate the Hero.
     */
    int imageIndex = 0;
    public void animateHero()
    {
        if(Greenfoot.isKeyDown(MyWorld.letter.toLowerCase()))
        {
            if(animationTimer.millisElapsed() < 100)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(slash[imageIndex]);
            imageIndex = (imageIndex + 1) % slash.length;
        }
        else
        {
            setImage(idle);
        }
        
    }
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        animateHero();
    }
    
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The hitbox of the Hero.
 * 
 * @author Bryan Zhu 
 * @version June 2024
 */
public class HeroHitbox extends Actor
{
    GreenfootImage hitbox = new GreenfootImage("images/ppl3.png");
    /**
     * Constructor
     */
    public HeroHitbox()
    {
        setImage(hitbox);
        hitbox.setTransparency(0);
    }
    
    /**
     * Act - do whatever the HeroHitbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}

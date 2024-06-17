import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Title Screen.
 * 
 * @author Bryan Zhu 
 * @version June 2024
 */
public class TitleWorld extends World
{
    Label titleLabel = new Label("Letter Attack", 60);
    Label loreLabel = new Label("The letters are attacking!", 30);
    Label instructionLabelOne = new Label("Press the right letter", 30);
    Label instructionLabelTwo = new Label("to stop them!", 30);
    Label instructionLabelThree = new Label("Press <space> to start!", 30);
    GreenfootSound startSound = new GreenfootSound("start-sound.wav");
    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 120);
        addObject(loreLabel, getWidth()/2, 180);
        addObject(instructionLabelOne, getWidth()/2, 220);
        addObject(instructionLabelTwo, getWidth()/2, 250);
        addObject(instructionLabelThree, getWidth()/2, 290);
    }
    
    /**
     * The main world act loop.
     */
    public void act()
    {
        // Starts the game when the user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            startSound.play();
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
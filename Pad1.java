import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pad1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pad1 extends Actor
{
    
    private String upKey;
    private String downKey;
 
    
    
    /**
     *  Initialize variables upon placement in the world
     * 
     */
    
    public Pad1(String uKeyPress, String dKeyPress)
    {
        upKey = uKeyPress;
        downKey = dKeyPress;
        
    }
    
    
    /**
     * Act - do whatever the Pad1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        control();
    }
    
    
    
    /**
     *
     * Use specific keys to move paddle up and down
     */
    public void control()
    {
        setRotation(-90);
        
        if(Greenfoot.isKeyDown(upKey))
        {
            move(3);
            
        }
        
        
        if(Greenfoot.isKeyDown(downKey))
        {
            move(-3);
            
        }
        
    }
    
    
    
    
}

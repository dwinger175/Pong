import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pad2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pad2 extends Actor
{
    /**
     * Act - do whatever the Pad2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        control();
    }
    
    public void control()
    {
        setRotation(-90);
        
        if(Greenfoot.isKeyDown("up"))
        {
            move(3);
            
        }
        
        
        if(Greenfoot.isKeyDown("down"))
        {
            move(-3);
            
        }
        
    }
    
    
    
    
}

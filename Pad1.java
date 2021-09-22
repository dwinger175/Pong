import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pad1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pad1 extends Actor
{
    /**
     * Act - do whatever the Pad1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        control();
    }
    
    public void control()
    {
        setRotation(-90);
        
        if(Greenfoot.isKeyDown("w"))
        {
            move(2);
            
        }
        
        
        if(Greenfoot.isKeyDown("s"))
        {
            move(-2);
            
        }
        
    }
    
    
    
    
}

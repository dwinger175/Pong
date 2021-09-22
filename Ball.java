import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 1;
    private int dY = 2;
        
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        checkForBounce();
        checkForEdge();
        
        
    }
    
    public void move()
    {
        setLocation(getX() + dX ,getY() + dY );
        
        
    }
    public void checkForBounce()
    {
        
        
         if (getY() <= 0 || getY() >= getWorld().getHeight() -1 )
        {
            
            dY = -dY;
        }
        
        
        if(isTouching(Pad1.class )){
            
            dX = -dX;
            
        }
        
         if(isTouching(Pad2.class )){
            
            dX = -dX;
            
        }
        
        
        
    }
    public void checkForEdge() 
    {
         if (getX() <= 0 || getX() >= getWorld().getWidth() -1 )
        {
            
            
        }
    
        
    }
    
}

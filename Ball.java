import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 2;
    private int dY = 2;
    private int  lWin = 0;   
    private int  rWin = 0; 
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        change();
        checkForBounce();
        checkForEdge();
        checkWin();
        
    }
    
    public void change()
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
            change();
        }
        
         if(isTouching(Pad2.class )){
            
            dX = -dX;
            change();
        }
        
        
        
    }
    public void checkForEdge() 
    {
         if (getX() <= 0 || getX() >= getWorld().getWidth() -1 )
        {
            getWorld();
            
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
            lWin++;
            
            Greenfoot.delay(200);
            
        }
        
        if(getX() >= getWorld().getWidth() -1 )
        {
            getWorld();
            
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
            rWin++;
            
            Greenfoot.delay(200);  
            
            
        }

        
    }
    
    public void checkWin() 
    {
        if (lWin ==8)
        {
            
            
            
            Greenfoot.stop();
            
        }
        
        if (rWin ==8)
        {
            
            
            Greenfoot.stop();
            
        }
        
    }
    
    
    
    
    
}

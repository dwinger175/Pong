import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 3;
    private int dY = 2;
    public int  lWin = 0;   
    public int  rWin = 0; 
    private int bounce = 1;
    
    
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
         if (isTouching(mid.class)){
             
             bounce = 1;
             
             
         }
             
        
        
        
         if (getY() <= 0 || getY() >= getWorld().getHeight() -1 )
        {
            
            dY = -dY;
             
        }
        
        
        if(isTouching(Pad1.class )){
            
            if (bounce == 1){
            
                
            Greenfoot.playSound("button-10.wav");  
            dX = -dX;
            bounce = 0;
            
            change();  
              }
            
            
        }
        
         if(isTouching(Pad2.class )){
            
            if (bounce == 1){
            
            Greenfoot.playSound("button-10.wav");  
            dX = -dX;
            bounce = 0;
            
            change();  
              }
        }
        
        
        
    }
    public void checkForEdge() 
    {
         if (getX() <= 1)
        {
            getWorld();
            
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            dX = -dX;
            lWin++;
            Greenfoot.delay(200);
            
        }
        
        if(getX() >= getWorld().getWidth() -1 )
        {
            getWorld();
            
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            dX = -dX;
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

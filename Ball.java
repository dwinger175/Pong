import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dX = 4;
    private int dY = 4;
    public int  lWin = 0;   
    public int  rWin = 0; 
    private int bounce = 1;
    
    private int wait = 0;
    
    private GreenfootImage win = new GreenfootImage("Win1.png");
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         
        if  (wait < 75)
        {
            wait = wait + 1;
        }
        
        
        
        
        
        
        if  (wait == 75)
        {
          change();
        checkForBounce();
        checkForEdge();
        checkWin();  
        }
       
        
    }
    
    
    
    /**
     *
     * Balls movement pattern
     */
    public void change()
    {
        setLocation(getX() + dX ,getY() + dY );
        
        
    }
    
    /**
     * Checks if  touching paddle or horizontal walls, if so reverse movement
     * "Bounce" Check if touching middle, if so allow bounce
     */
    
    
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
            
                
            Greenfoot.playSound("paddleHit.wav");  
            dX = -dX;
            bounce = 0;
            change();  
              }
            
            
        }
        
      
        
    }
    /**
     * Checks if touching x edge, if so Playsound, give point to correct side,
     * move ball to center, and delay the game
     * 
     */
    
    public void checkForEdge() 
    {
         if (getX() <= 1)
        {
            
            
            Greenfoot.playSound("pointScore.wav");
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            dX = -dX;
            lWin++;
            
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.score2();
            
            wait = 0;
             
        }
        
        if(getX() >= getWorld().getWidth() -1 )
        {
            
             MyWorld myWorld = (MyWorld) getWorld();
            myWorld.score1();
  
            
            Greenfoot.playSound("pointScore.wav");
            
            getWorld();
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            dX = -dX;
            rWin++;
            wait = 0;
            
            
        }

        
    }
    /**
     *   Checks how many points each side has, if it is equal to 8, change ball to win sign and end game
     * 
     */
    public void checkWin() 
    {
        if (lWin ==8)
        {
            Greenfoot.playSound("finalWin.wav");
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            setImage(win);
            Greenfoot.stop();
            
            
        }
        
        if (rWin ==8)
        {
            
            
            Greenfoot.playSound("finalWin.wav");
            setLocation(getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            setImage(win);
            
            Greenfoot.stop();
            
            
            
            
            
        }
        
    }
    
    
    
    
    
}

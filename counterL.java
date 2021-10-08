import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counterL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counterL extends Actor
{
    private GreenfootImage image0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    
    public int points = 0;
    
     /**
     * 
     * Assigns images to variables
     * 
     */
    public counterL()
    {
        image0 = new GreenfootImage("numbers-0.png");
        image1 = new GreenfootImage("numbers-1.png");
        image2 = new GreenfootImage("numbers-2.png");
        image3 = new GreenfootImage("numbers-3.png");
        image4 = new GreenfootImage("numbers-4.png");
        image5 = new GreenfootImage("numbers-5.png");
        image6 = new GreenfootImage("numbers-6.png");
        image7 = new GreenfootImage("numbers-7.png");
        image8 = new GreenfootImage("numbers-8.png");
    }
    
    
    /**
     * Act - do whatever the counterL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
     /**
     *  Adds Points
     * 
     */
    public void addScore()
    {
        points++;
        update();
        
    }
    /**
     * Changes image to correct number
     * 
     */
    public void update()
    {
        if (points == 1)
        {
            setImage(image1);
            
            
        }
        if (points == 2)
        {
            setImage(image2);
            
            
        }
        if (points == 3)
        {
            setImage(image3);
            
            
        }
        if (points == 4)
        {
            setImage(image4);
            
            
        }
        if (points == 5)
        {
            setImage(image5);
            
            
        }
        if (points == 6)
        {
            setImage(image6);
            
            
        }
        if (points == 7)
        {
            setImage(image7);
            
            
        }
        if (points == 8)
        {
            setImage(image8);
            
            
        }
    }
    
    
    
}

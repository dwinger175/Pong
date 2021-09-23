import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pad1 pad1 = new Pad1();
        addObject(pad1,25,215);
        Pad2 pad2 = new Pad2();
        addObject(pad2,575,223);
        Ball ball2 = new Ball();
        addObject(ball2,getWidth() / 2, getHeight() / 2);
        mid mid = new mid();
        addObject(mid,299,169);
    }
    
    public void checkWin () 
    {

        
        
        
    }
    
    
    
    
}

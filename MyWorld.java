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

        Ball ball2 = new Ball();
        addObject(ball2,getWidth() / 2, getHeight() / 2);
        mid mid = new mid();
        addObject(mid,getWidth() / 2,169);
        Pad1 pad1 = new Pad1("w", "s");
        addObject(pad1,getWidth() + 15 ,getHeight() / 2);
        pad1.setLocation(28,200);
        Pad1 pad12 = new Pad1("up", "down");
        addObject(pad12,getWidth() - 25,getHeight() / 2);
    }
    
   
}

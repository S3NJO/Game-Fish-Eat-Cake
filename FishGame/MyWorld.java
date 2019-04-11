import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
                
        
        addObject(new score(),70,40);
        addObject(new Fish1(),20,100);
        addObject(new cake(),20,200);
        addObject(new cake(),100,40);
        addObject(new cake(),890,100);
        addObject(new cake(),990,100);
        addObject(new cake(),390,100);
        addObject(new Boom(),590,100);
        
        prepare();
    }
    private void prepare()
    {
    } 
    }


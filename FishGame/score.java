import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    /**
     * Act - do whatever the score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int cake = 0;
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("Jumlah cake = "+cake, 25, Color.PINK, null);
        setImage(image);
    }    
}

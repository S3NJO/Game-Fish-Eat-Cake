import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     move(2);
        if (getY()<=5 || getY() >= getWorld().getHeight()-5){
            setRotation(90);
        turn(180);
        Actor Fish1 = getOneObjectAtOffset(0,0,Fish1.class);
       
        if ( Fish1 != null){
            removeTouching(Fish1.class);
            Greenfoot.stop();
            getWorld().addObject(new Lose(),300,200);
    }    
}
}
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish1 extends Actor
{
    /**
     * Act - do whatever the Fish1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(Greenfoot.isKeyDown("down")){
           move(-5);
           
    }  
        if(Greenfoot.isKeyDown("up")){
           move(5);
     
    }
        if(Greenfoot.isKeyDown("left")){
           turn(-5);
    }
        if(Greenfoot.isKeyDown("right")){
           turn(5);
    }
    Actor cake = getOneObjectAtOffset(0,0, cake.class);
        if(cake != null){
           getWorld().removeObject(cake); 
           score.cake++;
    }
}
    
}